package com.edu.yang.controller;

import com.edu.yang.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyongzhen
 * @date 2020/5/10 08:48
 */
@RestController
public class CloudClientController {

  @Autowired
  private RemoteService remoteService;

  @RequestMapping("client")
  public String clientMethod(){
     return remoteService.remoteMethod();
  }

}
