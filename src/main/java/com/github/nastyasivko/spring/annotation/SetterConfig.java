package com.github.nastyasivko.spring.annotation;

import com.github.nastyasivko.spring.Profiling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("setterConfig")
public class SetterConfig implements NameUser{

    private DefaultService defaultService;

    @Autowired
    public void setDefaultService(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    public DefaultService getDefaultService() {
        return defaultService;
    }

    public void sayHello() {
        defaultService.sayHello("user from setter config");
    }

    @Override
    public void sayHi(){
        System.out.println("Hello user from setter config!");
    }
}
