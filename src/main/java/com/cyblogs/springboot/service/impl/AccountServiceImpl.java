package com.cyblogs.springboot.service.impl;

import com.cyblogs.springboot.dao.AccountMapper;
import com.cyblogs.springboot.dao.IAccountDAO;
import com.cyblogs.springboot.domain.Account;
import com.cyblogs.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        return accountDAO.add(account);
    }

    @Override
    public int addMabtis(Account account) {
        return accountMapper.add(account.getName(), account.getMoney());
    }

    @Override
    public int delete(Long id) {
        return accountMapper.deleteByPrimaryKey(id);
    }


}