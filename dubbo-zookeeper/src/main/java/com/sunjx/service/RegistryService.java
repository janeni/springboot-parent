package com.sunjx.service;

/**
 * Auther: jx
 * Date: 2018/8/29
 * Time: 16:57
 */
public interface RegistryService {
    /**
     * 把服务注册到zookeeper
     * @param serviceName
     * @param serviceAddress
     */
    void register(String serviceName,String serviceAddress);
}
