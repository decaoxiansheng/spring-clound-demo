package com.dc.demo.controller;

import com.dc.demo.feignClient.ConsumerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dc
 */
@RestController
public class HelloController {
    @Autowired
    ConsumerFeignClient consumerFeignClient;
    @RequestMapping("/hello")
    public String index() {
        return consumerFeignClient.hello();
    }
}
