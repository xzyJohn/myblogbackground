package com.xzy.myblogbackground.web;

import com.xzy.myblogbackground.model.UserInfo;
import com.xzy.myblogbackground.service.RegisiterService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/regisiter")
public class RegisiterController {
    @Resource
    private RegisiterService regisiterService;

    @PostMapping
    public String add(@Validated @RequestBody UserInfo userInfo){
        regisiterService.save(userInfo);
        return "success";
    }
}
