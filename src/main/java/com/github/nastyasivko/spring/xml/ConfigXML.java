package com.github.nastyasivko.spring.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigXML {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.refresh();

        final DefaultService bean = context.getBean(DefaultService.class);
        bean.sayHello("XML");
    }
}
