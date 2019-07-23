package com.xzy.myblogbackground.web;

import com.xzy.myblogbackground.model.UserInfo;
import com.xzy.myblogbackground.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping
    public Long login(String userName,String password){
        Long result=loginService.login(userName,password);
        return result;
    }
}
