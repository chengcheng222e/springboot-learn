package com.cyblogs.springboot.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Getter
@Setter
public class Account {

    private Long id;
    private String name;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
