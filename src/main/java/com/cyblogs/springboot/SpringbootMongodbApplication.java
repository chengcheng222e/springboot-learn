package com.cyblogs.springboot;

import com.cyblogs.springboot.dao.CustomerRepository;
import com.cyblogs.springboot.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        // save a couple of customers
        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
    }
}
