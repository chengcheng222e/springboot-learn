package com.cyblogs.springboot.dao.impl;

import com.cyblogs.springboot.dao.IAccountDAO;
import com.cyblogs.springboot.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Repository
public class AccountDAOImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)", account.getName(), account.getMoney());
    }

}
