package com.yuanqinnan.spring.cloud.learn.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/16 22:05
 */
//服务提供者的名字
@FeignClient(value = "spring-cloud-learn-provider-dept")
public interface DeptService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
