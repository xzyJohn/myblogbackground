package com.xzy.myblogbackground;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xzy.myblogbackground.mapper"})
public class MyblogbackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogbackgroundApplication.class, args);
    }

}
