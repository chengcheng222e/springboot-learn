package com.cyblogs.springboot.web.demo.service.impl;

import com.cyblogs.springboot.web.demo.common.VersionEnum;
import com.cyblogs.springboot.web.demo.service.AbstractCommonSerice;
import com.cyblogs.springboot.web.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 11:50
 */
@Slf4j
@Service
public class DemoV1Service extends AbstractCommonSerice implements DemoService {

    @Override
    public String sayHello(String str) {
        log.info("======= 这里执行的是{}版本代码", this.getClass());
        return str + VersionEnum.V1.getVersion();
    }

    @Override
    public String getVersion() {
        return DemoService.class.getName() + "_" + VersionEnum.V1.getVersion();
    }
}
