package com.dc.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dc
 * Description: 服务接口
 * name:远程服务名，即服务提供者spring.application.name中配置的名称
 * 此类中的方法和远程服务中Contoller中的方法名和参数需保持一致。
 */
@FeignClient(name = "provider")
public interface ConsumerFeignClient {

    /**
     * hello
     * @return String
     */
    @RequestMapping(value = "/hello")
    public String hello();
}
