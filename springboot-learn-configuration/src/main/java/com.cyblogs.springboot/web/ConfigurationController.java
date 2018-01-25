package com.cyblogs.springboot.web;

import com.cyblogs.springboot.bean.ConfigBean;
import com.cyblogs.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@RestController
public class ConfigurationController {

    @Value("${chenyuan.name}")
    private String name;

    @Value("${chenyuan.age}")
    private String age;

    @Autowired
    private User user;

    @Autowired
    private ConfigBean configBean;

    /**
     * 获取properties里面的配置
     *
     * @return
     */
    @RequestMapping(value = {"properties-config", "properties-config2"}, method = RequestMethod.GET)
    public String propertiesConfig() {
        return name + ":" + age;
    }


    @RequestMapping(value = "/config-bean")
    public String configBean() {
        return configBean.getName() + ">>>>" + configBean.getAge();
    }

    @RequestMapping(value = "/config-user")
    public String configUser() {
        return user.getName() + ">>>>" + user.getAge();
    }


}
