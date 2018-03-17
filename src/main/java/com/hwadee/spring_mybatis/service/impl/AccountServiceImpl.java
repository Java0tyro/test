package com.hwadee.spring_mybatis.service.impl;

import com.hwadee.spring_mybatis.dao.AccountMapper;
import com.hwadee.spring_mybatis.dao.BlogMapper;
import com.hwadee.spring_mybatis.model.Account;
import com.hwadee.spring_mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private BlogMapper blogMapper;


    @Override
    public Account getAccountById(int aid) {
        return accountMapper.selectByPrimaryKey(aid);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public int update(Account account) {
        return accountMapper.updateByPrimaryKeySelective( account );
    }

    public Account login(String email, String password){
        Account account = accountMapper.findByEmail(email);
        if( null == account || ! password.equals( account.getPassword() )) {
            throw new RuntimeException("用户名或密码错误");
        }
        return account;
    }

    @Transactional
    @Override
    public int transfter(int a, int b, int c) {

        Account accountA = accountMapper.selectByPrimaryKey(a);
        Account accountB = accountMapper.selectByPrimaryKey(b);

        //accountMapper.updateByPrimaryKey();
        //accountMapper.updateByPrimaryKey();
        //blogMapper.insert();

        return 0;
    }
}
