package com.cyblogs.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@ConfigurationProperties(prefix = "chenyuan")
@Component
@Getter
@Setter
public class ConfigBean {

    private String name;

    private Integer age;
}
