package com.edu.yang.service;

import org.springframework.stereotype.Service;

/**
 * @author yangyongzhen
 * @date 2020/5/13 22:14
 */
@Service
public class RemoteServiceFallBack implements RemoteService {

    @Override
    public String remoteMethod() {
        return "调用远程接口失败！";
    }
}
