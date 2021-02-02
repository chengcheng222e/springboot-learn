package com.cyblogs.springboot.web.demo;

import com.cyblogs.springboot.starter.first.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with springboot-learn
 *
 * @description:
 * @author: chenyuan
 * @date: 2019/4/19
 * @time: 2:19 PM
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class WebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDemoApplication.class, args);
    }

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input")
    public String input(String word) {
        return exampleService.wrap(word);
    }
}
