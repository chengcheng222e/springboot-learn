package com.cyblogs.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@ConfigurationProperties(prefix = "my")
@Component
@Getter
@Setter
public class ConfigBean {

    private String name;

    private Integer age;
}
