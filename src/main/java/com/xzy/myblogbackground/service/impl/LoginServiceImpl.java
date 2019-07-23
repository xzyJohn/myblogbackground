package com.xzy.myblogbackground.service.impl;

import com.xzy.myblogbackground.mapper.LoginMapper;
import com.xzy.myblogbackground.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public Long login(String userName, String password) {
        Long id=loginMapper.login(userName,password);
        if(id==null){
            return 0L;
        }
        return id;
    }
}
