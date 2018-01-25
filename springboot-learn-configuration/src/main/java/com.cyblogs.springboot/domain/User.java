package com.cyblogs.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Configuration
@PropertySource(value = "classpath:/app.properties")
@ConfigurationProperties(prefix = "chenyuan.property")
@Setter
@Getter
public class User {

    private String name;

    private Integer age;
}
