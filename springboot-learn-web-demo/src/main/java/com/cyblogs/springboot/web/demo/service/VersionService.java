package com.cyblogs.springboot.web.demo.service;

import com.cyblogs.springboot.web.demo.common.VersionEnum;

import java.util.Map;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 11:53
 */
public interface VersionService {

    String getVersion();

    VersionService getService(String version);

}
