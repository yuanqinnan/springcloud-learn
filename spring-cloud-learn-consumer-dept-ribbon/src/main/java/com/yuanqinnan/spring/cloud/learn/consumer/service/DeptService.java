package com.yuanqinnan.spring.cloud.learn.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/5 23:24
 */
@Service
public class DeptService {
    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message) {
        //这里指指定了服务名称，不用管ip 地址与端口
        return restTemplate.getForObject("http://SPRING-CLOUD-LEARN-PROVIDER-DEPT/hi?message=" + message, String.class);
    }
}
