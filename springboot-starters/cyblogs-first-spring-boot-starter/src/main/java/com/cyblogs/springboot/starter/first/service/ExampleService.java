package com.cyblogs.springboot.starter.first.service;

/**
 * Created with springboot-learn
 *
 * @description:
 * @author: chenyuan
 * @date: 2019/4/19
 * @time: 2:08 PM
 */
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
