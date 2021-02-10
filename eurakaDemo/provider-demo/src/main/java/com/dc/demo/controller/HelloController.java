package com.dc.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dc
 */
@RestController
public class HelloController {
    /**
     * 注入“服务提供者”的名称
     */
    @Value("${provider.name}")
    private String name;
    /**
     * 注入“服务提供者”的端口号
     */
    @Value("${server.port}")
    private String port;

    /**
     * 对外提供接口
     * @return String
     */
    @RequestMapping("/hello")
    public String hello() {
        //返回数据
        return "provider:" + name + "，port:" + port;
    }
}
