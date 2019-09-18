package com.yuanqinnan.spring.cloud.learn.consumer.service;

import org.springframework.stereotype.Component;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/17 23:04
 */
@Component
public class DeptServiceHystrix implements DeptService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
