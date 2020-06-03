package com.cyblogs.springboot.service.impl;

import com.cyblogs.springboot.dao.AccountMapper;
import com.cyblogs.springboot.domain.Account;
import com.cyblogs.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        return accountMapper.add(account.getName(), account.getMoney());
    }

    @Override
    public int delete(Long id) {
        return accountMapper.deleteByPrimaryKey(id);
    }

    // @Transactional
    @Override
    public int update(Long frist, Long second) {
        accountMapper.update(frist, 90.00);
        int i = 1 / 0;
        accountMapper.update(second, 110.00);
        return 1;
    }

    @Override
    public Account selectById(Long id) {
        return accountMapper.selectById(id);
    }
}
