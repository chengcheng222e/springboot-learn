package com.cyblogs.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@SpringBootApplication
@MapperScan("com.cyblogs.springboot.dao")
public class SpringBootMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisApplication.class, args);
    }

}
