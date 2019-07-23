package com.xzy.myblogbackground.service.impl;

import com.xzy.myblogbackground.mapper.RegisiterMapper;
import com.xzy.myblogbackground.model.UserInfo;
import com.xzy.myblogbackground.service.RegisiterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class RegisiterServiceImpl implements RegisiterService {
    @Resource
    private RegisiterMapper regisiterMapper;

    @Override
    public void save(UserInfo userInfo) {
        regisiterMapper.save(userInfo);
    }
}
