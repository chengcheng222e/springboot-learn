package com.cyblogs.springboot.dao;

import com.cyblogs.springboot.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
