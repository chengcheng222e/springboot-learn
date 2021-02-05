package com.cyblogs.springboot.web.demo.controller;

import com.cyblogs.springboot.web.demo.common.VersionStrateFactory;
import com.cyblogs.springboot.web.demo.service.VersionService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Optional;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 14:02
 */
public abstract class AbstractCommonController {

    @Resource
    private VersionStrateFactory versionStrateFactory;

    public VersionService getService(String version) {
        Optional<VersionService> versionServiceOptional = versionStrateFactory.getFactory(version);
        VersionService messageSendService = versionServiceOptional.orElseThrow(() -> new IllegalArgumentException("找不到对应版本的服务=" + version));
        return messageSendService;
    }


    protected String getVersion(Class clazz, String version) {
        return clazz.getName() + "_" + version;
    }
}
