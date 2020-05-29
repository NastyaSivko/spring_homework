package com.github.nastyasivko.spring;

import com.github.nastyasivko.spring.java_config.Config;
import com.github.nastyasivko.spring.java_config.DefaultService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {

    @Test
    void testJavaConfig(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        final DefaultService bean = context.getBean(DefaultService.class);
        bean.sayHello("java config from test");
    }

}
