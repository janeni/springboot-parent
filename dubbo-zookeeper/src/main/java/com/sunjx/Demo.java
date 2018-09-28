package com.sunjx;

import com.sunjx.consumer.ServiceDiscovery;
import com.sunjx.service.RegistryService;
import com.sunjx.service.impl.RegistryServiceImpl;

/**
 * Auther: jx
 * Date: 2018/9/7
 * Time: 14:50
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        RegistryService serviceRegistry=new RegistryServiceImpl();
        //http:// 两个斜杠需要转义
        serviceRegistry.register("product-service","135.0.64.51:20881");
        System.in.read();
    }
}
