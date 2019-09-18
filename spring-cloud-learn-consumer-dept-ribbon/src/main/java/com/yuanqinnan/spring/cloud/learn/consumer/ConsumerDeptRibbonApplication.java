package com.yuanqinnan.spring.cloud.learn.consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/5 22:04
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class ConsumerDeptRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptRibbonApplication.class, args);
    }
}
