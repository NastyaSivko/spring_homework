package com.github.nastyasivko.spring;

import com.github.nastyasivko.spring.annotation.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestAnnotationConfig {

    @Test
    void testAnnotationConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        final Config bean = context.getBean(Config.class);
        bean.getDefaultService().sayHello("bean from annotation test");
    }

    @Test
    void testFieldConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfigField.xml");
        final FieldConfig bean = context.getBean(FieldConfig.class);
        bean.sayHiName();
    }

    @Test
    void testSetterConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        final SetterConfig bean = context.getBean(SetterConfig.class);
        bean.sayHello();
    }

    @Test
    void testConstructorConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfigConstructor.xml");
        final ConstructorConfig bean = context.getBean(ConstructorConfig.class);
        assertNotNull(bean);
    }

    @Test
    void testTwoImplementsFromOneInterfaceSetter() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        final SetterConfig bean = (SetterConfig) context.getBean("setterConfig");
        bean.sayHi();
    }

    @Test
    void testTwoImplementsFromOneInterfaceConfig() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfig.xml");
        final Config bean = (Config) context.getBean("config");
        bean.sayHi();
    }

    @Test
    void testParamsFromDoc() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConfigForSecond.xml");
        final Config bean1 = (Config) context.getBean("config1");
        final Config bean2 = (Config) context.getBean("config2");
        bean1.infoUser();
        bean2.infoUser();
        context.close();
    }

    @Test
    void testListOfBeans(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationList.xml");
        final ConfigForListService bean = context.getBean(ConfigForListService.class);
//        показывает,что есть список бинов
        bean.getList();
    }

}
