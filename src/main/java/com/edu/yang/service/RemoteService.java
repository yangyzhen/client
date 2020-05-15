package com.edu.yang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yangyongzhen
 * @date 2020/5/13 22:13
 */
@FeignClient(value = "cloud-service" ,fallback = RemoteServiceFallBack.class)
public interface RemoteService {

    @RequestMapping(value = "/cloud",method = RequestMethod.GET)
    String remoteMethod();
}
