package com.cyblogs.springboot.web.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 11:53
 */
@Getter
@AllArgsConstructor
public enum VersionEnum {

    V1("1.0.0"),
    V2("2.0.0"),
    ;

    private String version;

}
