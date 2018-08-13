package com.example.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wupeng
 * @date ：Created in 14:55 2018/8/13
 * @description： RefreshScope注解可以动态的加载配置中心修改后的配置
 */
@RefreshScope
@RestController
public class HelloController {

  @Value("${message: 本地消息}")
  private String message;

  @RequestMapping("message")
  public String message() {
    return this.message;
  }
}
