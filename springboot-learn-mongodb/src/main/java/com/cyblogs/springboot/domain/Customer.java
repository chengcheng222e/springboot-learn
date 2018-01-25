package com.cyblogs.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Setter
@Getter
public class Customer {
    @Id
    public String id;
    public String firstName;
    public String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
