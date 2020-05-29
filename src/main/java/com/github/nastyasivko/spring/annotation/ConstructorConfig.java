package com.github.nastyasivko.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorConfig {
    private DefaultService defaultService;

    @Autowired
    public ConstructorConfig(DefaultService defaultService){
        this.defaultService = defaultService;
    }

}
