package com.cyblogs.springboot.service;

import com.cyblogs.springboot.domain.Account;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
public interface IAccountService {

    int add(Account account);

    int delete(Long id);

    int update(Long id1, Long id2);

    Account selectById(Long id);

}
