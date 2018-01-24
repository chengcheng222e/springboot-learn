package com.cyblogs.springboot.web;

import com.cyblogs.springboot.bean.ConfigBean;
import com.cyblogs.springboot.domain.User;
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
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class PrintConfigBeanController {

    @Autowired
    private ConfigBean configBean;
    @Autowired
    private User user;

    @RequestMapping(value = "/config")
    public String config() {
        return configBean.getName() + ">>>>" + configBean.getAge();
    }

    @RequestMapping(value = "/config/user")
    public String configUser() {
        return user.getName() + ">>>>" + user.getAge();
    }
}
