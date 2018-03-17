package com.hwadee.spring_mybatis.service;

import com.hwadee.spring_mybatis.model.Account;

import java.util.List;

public interface AccountService {


    Account login(String email, String pasword);


    int transfter(int a, int b, int c);

    List<Account> findAll();


    Account getAccountById(int aid );

    int update(Account account);
}
