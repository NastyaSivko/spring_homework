package com.github.nastyasivko.spring;

import com.github.nastyasivko.spring.xml.DefaultService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {

    @Test
    void testConfigXML() {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("beansTest.xml");
        final DefaultService bean = context.getBean(DefaultService.class);
        bean.sayHello("XML from test");
    }
}
