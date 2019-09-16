package com.yuanqinnan.spring.cloud.learn.provider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/5 22:04
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderDeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDeptApplication.class, args);
    }
}
