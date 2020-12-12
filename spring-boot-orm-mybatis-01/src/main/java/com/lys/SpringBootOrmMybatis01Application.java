package com.lys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lys.dao")
@SpringBootApplication
public class SpringBootOrmMybatis01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrmMybatis01Application.class, args);
    }

}
