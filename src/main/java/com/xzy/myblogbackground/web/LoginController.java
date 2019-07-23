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

    @PostMapping
    public String login(@Validated @RequestBody UserInfo userInfo){
        int result=loginService.login(userInfo.getUserName(),userInfo.getPassword());
        if(result!=1){
            return "error";
        }
        return "success";
    }
}
