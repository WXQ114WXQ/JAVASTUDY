package com.qdc.demoeurekaprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;
    //定义一个方法处理请求
    @RequestMapping(value = "/port")
    public String testport(){
        return "hello,I'm from" + port;
    }
}
