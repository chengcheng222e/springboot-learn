package com.cyblogs.springboot.web.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
public class WebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDemoApplication.class, args);
    }

}
