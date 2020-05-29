package com.github.nastyasivko.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigForList {

    @Bean
    public DefaultService getDefaultService(){
        DefaultService defaultService = new DefaultService();
        defaultService.sayHello("bean from config for list");
        return defaultService;
    }

    @Bean
    public DefaultService getMessageDefaultService(){
        DefaultService defaultService = new DefaultService();
        defaultService.sayHi();
        return defaultService;
    }
}
