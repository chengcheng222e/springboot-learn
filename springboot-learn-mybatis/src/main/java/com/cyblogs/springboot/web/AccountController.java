package com.cyblogs.springboot.web;

import com.alibaba.fastjson.JSON;
import com.cyblogs.springboot.domain.Account;
import com.cyblogs.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addMybatis(@RequestParam(value = "name") String name, @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int t = accountService.add(account);
        if (t == 1) {
            return JSON.toJSONString(account);
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id") String id) {
        int t = accountService.delete(Long.parseLong(id));
        return t == 1 ? Boolean.TRUE + "" : Boolean.FALSE + "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(@RequestParam(value = "first") Long first, @RequestParam(value = "second") Long second) {
        int t = accountService.update(first, second);
        return t == 1 ? Boolean.TRUE + "" : Boolean.FALSE + "";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(Long id) {
        Account account = accountService.selectById(id);
        return JSON.toJSONString(account);
    }

}
