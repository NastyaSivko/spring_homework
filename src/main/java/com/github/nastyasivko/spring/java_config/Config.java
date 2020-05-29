package com.github.nastyasivko.spring.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public DefaultService getDefaultService(){
        DefaultService defaultService = new DefaultService("user from congig");
        defaultService.sayHello("bean from java");
        return defaultService;
    }
}
