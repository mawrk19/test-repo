package com.rit.ces.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    // Existing configuration

    // Add EWA Student Development Guidelines and RIT Web Standards adherence
    public void addResourceHandlers(WebMvcConfigurer config) {
        config.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        config.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        config.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
    }
}