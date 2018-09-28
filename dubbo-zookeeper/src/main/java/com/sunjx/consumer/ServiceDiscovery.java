package com.sunjx.consumer;

import com.sunjx.LoadBalance;
import com.sunjx.service.RandomLoadBalance;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheEvent;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther: jx
 * Date: 2018/9/3
 * Time: 11:11
 */
public class ServiceDiscovery {
    List<String> serviceRepos=new ArrayList<>();//缓存服务器地址的集合

    LoadBalance loadBalance;

    private CuratorFramework curatorFramework=null;//api

    public static final String REGISTRY_ROOT="/registry";//namespace

    {
        loadBalance =new RandomLoadBalance();
        curatorFramework= CuratorFrameworkFactory.builder().connectString("127.0.0.1")
                .sessionTimeoutMs(5000)
                .retryPolicy(new ExponentialBackoffRetry(1000,0)).build();
        curatorFramework.start();
    }

    public void init(String serviceName) throws Exception {
        String path=REGISTRY_ROOT+"/"+serviceName;
        try {
            serviceRepos=curatorFramework.getChildren().forPath(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        registerWatcher(path);

    }

    private void registerWatcher(String path) throws Exception {
        PathChildrenCache pathChildrenCache=new PathChildrenCache(curatorFramework,path,true);
        PathChildrenCacheListener pathChildrenCacheListener=new PathChildrenCacheListener() {
            @Override
            public void childEvent(CuratorFramework curatorFramework, PathChildrenCacheEvent pathChildrenCacheEvent) throws Exception {
                serviceRepos=curatorFramework.getChildren().forPath(path);
            }
        };
        pathChildrenCache.getListenable().addListener(pathChildrenCacheListener);
        pathChildrenCache.start();
    }

    public String getServiceEndPoint(){
        return loadBalance.selectHost(serviceRepos);
    }

    public static void main(String[] args) throws Exception {
        ServiceDiscovery serviceDiscovery=new ServiceDiscovery();
        serviceDiscovery.init("product-service");
        for (int i=0;i<20;i++){
            System.out.println(serviceDiscovery.getServiceEndPoint());
            Thread.sleep(4000);
        }
    }



}
