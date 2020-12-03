package com.lys.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration //声明这是一个配置类 在Spring中可以代替xml文件
@ConfigurationProperties("vegetables") //声明这是配置文件类 并且声明前缀
@PropertySource("classpath:vegetables.properties") //声明文件对应的地址
public class VegetablesConfig {
    private String potato;
    private String tomato;

}
