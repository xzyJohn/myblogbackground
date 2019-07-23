package com.xzy.myblogbackground.mapper;

import com.xzy.myblogbackground.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface RegisiterMapper {


    @Insert("insert into user_info set user_name=#{userInfo.userName},password=#{userInfo.password},name=#{userInfo.name}," +
            "mail=#{userInfo.mail},gender=#{userInfo.gender},date=#{userInfo.date},introduce=#{userInfo.introduce}")
    void save(@Param("userInfo") UserInfo userInfo);
}
