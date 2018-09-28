package com.sunjx.service.impl;

import com.sunjx.service.RegistryService;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

import java.io.IOException;


/**
 * Auther: jx
 * Date: 2018/8/29
 * Time: 17:00
 */
public class RegistryServiceImpl implements RegistryService {
    CuratorFramework curatorFramework=null;//api

    private static final String REGISTRY_ROOT="/registry";//namespace

    {
        //跟心跳有关 sessionTimeoutMs 连接超时/会话超时 心跳 连接时没有响应 返回超时
        //用心跳保持长连接
        curatorFramework = CuratorFrameworkFactory.builder().connectString("127.0.0.1:2181")
                .sessionTimeoutMs(5000).retryPolicy(new ExponentialBackoffRetry(1000,0))
                .build();
        curatorFramework.start();
    }
    @Override
    public void register(String serviceName, String serviceAddress) {
        String servicePath=REGISTRY_ROOT+"/"+serviceName;
        try {
            //判断product-service的路径是否存在
            if(null == curatorFramework.checkExists().forPath(servicePath)){
                curatorFramework.create().creatingParentsIfNeeded()
                        .withMode(CreateMode.PERSISTENT)
                        .forPath(servicePath,"0".getBytes());
            }
            //创建协议地址
            String addressPath=servicePath+"/"+serviceAddress;//当前服务存在的dubbo地址
            curatorFramework.create().withMode(CreateMode.EPHEMERAL).forPath(addressPath);
            System.out.println("节点注册成功"+addressPath );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        RegistryService serviceRegistry=new RegistryServiceImpl();
        //http:// 两个斜杠需要转义
        serviceRegistry.register("product-service","135.0.64.50:20880");
        System.in.read();
    }
}
