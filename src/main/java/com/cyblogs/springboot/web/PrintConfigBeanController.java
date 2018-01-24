package com.cyblogs.springboot.web;

import com.cyblogs.springboot.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class PrintConfigBeanController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "/config")
    public String printConfigBean() {
        return configBean.getName() + ">>>>" + configBean.getAge();
    }
}
