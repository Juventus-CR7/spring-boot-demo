package com.lys.config;

import com.lys.filter.TestFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<TestFilter1> filterRegister(){
        FilterRegistrationBean<TestFilter1> filter = new FilterRegistrationBean<>();
        filter.setFilter(new TestFilter1());
        filter.addUrlPatterns("/*");
        return filter;
    }
}
