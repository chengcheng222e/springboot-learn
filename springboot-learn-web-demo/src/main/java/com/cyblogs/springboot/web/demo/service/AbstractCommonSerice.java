package com.cyblogs.springboot.web.demo.service;

import com.cyblogs.springboot.web.demo.common.VersionStrateFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 14:02
 */
@Service
public abstract class AbstractCommonSerice implements VersionService {

    @Resource
    private VersionStrateFactory versionStrateFactory;

    @PostConstruct
    protected void init() {
        versionStrateFactory.registerSingleFactory(getVersion(), this);
    }

    @Override
    public VersionService getService(String version) {
        Optional<VersionService> versionServiceOptional = versionStrateFactory.getFactory(version);
        VersionService messageSendService = versionServiceOptional.orElseThrow(() -> new IllegalArgumentException("找不到对应版本的服务=" + version));
        return messageSendService;
    }
}
