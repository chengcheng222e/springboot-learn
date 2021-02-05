package com.cyblogs.springboot.web.demo.controller;

import com.alibaba.fastjson.JSON;
import com.cyblogs.springboot.web.demo.common.DemoReq;
import com.cyblogs.springboot.web.demo.service.DemoService;
import com.cyblogs.springboot.web.demo.service.impl.DemoV1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 11:29
 */
@RestController
@Slf4j
public class HelloController extends AbstractCommonController {

    @Resource
    private DemoV1Service demoV1Service;


    @PostMapping("/learn/input")
    public String input(@RequestBody DemoReq demoReq) {
        log.info("demoReq={}", JSON.toJSONString(demoReq));
        log.info("======version={}=====", demoReq.getVersion());
        return demoV1Service.sayHello(demoReq.getWord());
    }

    @PostMapping("/learn/version/input")
    public String versionInput(@RequestBody DemoReq demoReq) {
        log.info("demoReq={}", JSON.toJSONString(demoReq));

        log.info("======version={}=====", demoReq.getVersion());
        DemoService demoService = (DemoService) getService(getVersion(DemoService.class, demoReq.getVersion()));

        return demoService.sayHello(demoReq.getWord());
    }

}
