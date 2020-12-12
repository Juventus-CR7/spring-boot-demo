package com.lys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lys.mapper")
@SpringBootApplication
public class SpringBootOrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrmMybatisApplication.class, args);
    }

}
