package com.itbaizhan.controller;

import com.itbaizhan.model.ResponseData;
import com.itbaizhan.model.UserPO;
import com.itbaizhan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Resource
    private UserService userService ;

    @ResponseBody
    @RequestMapping("/login")
    public ResponseData login(UserPO userPO, HttpSession session){
        UserPO user = userService.login(userPO);
        System.out.println(userPO.getUsername());
        System.out.println(userPO.getPassword());
        ResponseData respd = new ResponseData();
        if(user == null){
            respd.setStatus(300);
            respd.setMessage("用户或密码错误");
            return  respd ;
        }
        session.setAttribute("login", user);
        return  ResponseData.ok("登陆成功" , user) ;
    }
}
