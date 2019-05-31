package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void AddViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/product").setViewName("product");
        registry.addViewController("/greeting").setViewName("greeting");
        registry.addViewController("/login").setViewName("login");
    }
}
