package com.xzy.myblogbackground.mapper;

import org.apache.ibatis.annotations.Select;

public interface LoginMapper {
    @Select("select id from user_info where user_name=#{userName} and password=#{password}")
    Long login(String userName, String password);
}
