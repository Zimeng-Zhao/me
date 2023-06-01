package com.me;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.me"})
//@MapperScan("com.me.test.mapper")
public class MeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeApplication.class, args);
    }

}
