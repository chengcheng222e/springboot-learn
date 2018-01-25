package com.cyblogs.springboot;

import com.alibaba.fastjson.JSON;
import com.cyblogs.springboot.dao.CustomerRepository;
import com.cyblogs.springboot.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Slf4j
@SpringBootApplication
public class SpringbootMongoDBApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongoDBApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info(JSON.toJSONString(customer));
        }
        log.info("-------------------------------");
    }
}
