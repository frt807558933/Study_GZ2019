package com.demo.springbootdemo.Controller;

import com.demo.springbootdemo.Mappers.UserMapper;
import com.demo.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
   @RequestMapping("/do")
    public String doResponse(){
       List<User> list=userMapper.getUserList();
        return "SpringBoot--Start-Success！"+list;
    }
}
