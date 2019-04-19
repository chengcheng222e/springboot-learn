package com.cyblogs.springboot.starter.first.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with springboot-learn
 *
 * @description:
 * @author: chenyuan
 * @date: 2019/4/19
 * @time: 2:09 PM
 */
@Getter
@Setter
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;
}
