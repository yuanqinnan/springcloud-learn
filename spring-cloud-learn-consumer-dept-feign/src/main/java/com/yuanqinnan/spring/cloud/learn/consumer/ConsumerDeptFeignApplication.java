package com.yuanqinnan.spring.cloud.learn.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/16 22:01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class ConsumerDeptFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeignApplication.class, args);
    }
}
