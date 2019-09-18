package com.yuanqinnan.spring.cloud.learn.consumer.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/17 23:19
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public String sayHi(String message) {
                return "Hi，your message is :\"" + message + "\" but request error.";
            }
        };
    }
}
