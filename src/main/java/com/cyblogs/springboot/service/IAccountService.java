package com.cyblogs.springboot.service;

import com.cyblogs.springboot.domain.Account;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
public interface IAccountService {
    int add(Account account);

    int addMabtis(Account account);

    int delete(Long id);

    int update(Long id1, Long id2);
}
