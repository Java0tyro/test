package com.hwadee.spring_mybatis.controller;

import com.hwadee.spring_mybatis.dao.AccountMapper;
import com.hwadee.spring_mybatis.model.Account;
import com.hwadee.spring_mybatis.model.Blog;
import com.hwadee.spring_mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//@RequestMapping(value="/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping(value = "/")
    public String index(Model model){
        List<Account> accounts = accountService.findAll();

        model.addAttribute("accounts", accounts);

        return "index";
    }

   /* @RequestMapping(value = "/check", method= RequestMethod.GET)
    public @ResponseBody int check(String email ){

        Account account = accountMapper.findByEmail( email );
        if( null == account ){
            return 0;
        }
        return 1;
       //return account;
    }*/

/*    @RequestMapping(value = "/check", method= RequestMethod.GET)
    public ResponseEntity<Integer> check(String email ){

        Account account = accountMapper.findByEmail( email );
        if( null == account ){
          //  return 0;
        }
        return new ResponseEntity<Integer>(1, ResponseStat);

        //return account;
    }*/

    //http://127.0.0.1/account/32324
    @RequestMapping(value="/account/{aid}",method=RequestMethod.GET)
    public String get(@PathVariable("aid") int aid, Model model){
        Account account = accountService.getAccountById(aid);
        model.addAttribute("account", account);

        return "account/update";
    }

    @RequestMapping(value="/account/update",method = RequestMethod.POST)
    public String update( Account account ){
        int count = accountService.update(account);
        if( count == 1 ){

        }
        return "redirect:/accounts";
    }

    //

    @RequestMapping(value = "/helloworld",method= RequestMethod.GET)
    public String helloworld(@RequestParam(required = false)String email, Account account,  String [] hobby, Model model){
        System.out.println("email:" + email + "再测试热部署一下???");
       // System.out.println("Hello World!" + blog.getAccount().getNickName());

        for(String h : hobby){
            System.out.println(h);
        }

        System.out.println("////"+ account );

        model.addAttribute("","");

        return "index";
    }

}
