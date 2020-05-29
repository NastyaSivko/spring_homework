package com.github.nastyasivko.spring.annotation;

import com.github.nastyasivko.spring.Profiling;
import org.springframework.beans.factory.annotation.Autowired;

public class FieldConfig {

    @Autowired(required = false)
    private String name;


    public void sayHiName() {
        DefaultService defaultService = new DefaultService();
        name = "user from field config";
        defaultService.sayHello(name);
    }
}
