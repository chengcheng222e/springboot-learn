package com.cyblogs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@RestController
@SpringBootApplication
public class SpringbootDockerApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerApplication.class, args);
    }
}
