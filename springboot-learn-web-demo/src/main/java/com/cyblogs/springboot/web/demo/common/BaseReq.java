package com.cyblogs.springboot.web.demo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with spring-famliy-learn
 *
 * @Description:
 * @Author: chenyuan
 * @Date: 2021/2/3
 * @Time: 11:26
 */
@Data
public class BaseReq implements Serializable {

    private static final long serialVersionUID = -3202704703392475046L;
    protected String version;

}
