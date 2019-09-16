package com.yuanqinnan.spring.cloud.learn.consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/5 22:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerDeptRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptRibbonApplication.class, args);
    }
}
