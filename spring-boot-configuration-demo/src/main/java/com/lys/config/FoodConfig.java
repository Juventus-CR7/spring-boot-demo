package com.lys.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter@Setter
@ConfigurationProperties("food")
public class FoodConfig {
    private String rice;
    private String dishes;
    private String[]sauce;
}
