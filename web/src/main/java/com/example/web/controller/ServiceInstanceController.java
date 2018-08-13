package com.example.web.controller;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：wupeng
 * @date ：Created in 17:07 2018/8/13
 * @description：
 */
@RestController
public class ServiceInstanceController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instance/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable("applicationName") String applicationName){
        return this.discoveryClient.getInstances(applicationName);
    }
}
