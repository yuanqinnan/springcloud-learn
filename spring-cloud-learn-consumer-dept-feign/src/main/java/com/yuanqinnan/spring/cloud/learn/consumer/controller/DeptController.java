package com.yuanqinnan.spring.cloud.learn.consumer.controller;

import com.yuanqinnan.spring.cloud.learn.consumer.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: spring-cloud-learn
 * <p>
 * Created by yuanqn on 2019/9/16 22:08
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return deptService.sayHi(message);
    }
}
