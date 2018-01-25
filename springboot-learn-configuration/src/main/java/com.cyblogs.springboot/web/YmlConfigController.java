package com.cyblogs.springboot.web;

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
public class YmlConfigController {

    @Value("${chenyuan.name}")
    private String name;

    @Value("${chenyuan.age}")
    private String age;

    /**
     * 获取yml文件里面的配置
     *
     * @return
     */
    @RequestMapping(value = {"ymlconfig", "ymlconfig2"}, method = RequestMethod.GET)
    public String ymlConfig() {
        return name + ":" + age;
    }

}
