package com.hwadee.spring_mybatis.service.impl; 

import com.hwadee.spring_mybatis.model.Account;
import com.hwadee.spring_mybatis.service.AccountService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/** 
* AccountServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 13, 2018</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class AccountServiceImplTest {
    @Autowired
    private AccountService accountService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: login(String email, String password) 
* 
*/ 
@Test
public void testLogin() throws Exception {
    Account account = accountService.login("zhangsan@gmail.com","123456");

    Assert.notNull(account, "success");

    System.out.println( account );
} 


} 
