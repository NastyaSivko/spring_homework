package com.github.nastyasivko.spring.java_config;

public class DefaultService {
    private String name;

    public DefaultService(String name) {
        this.name = name;
    }

    public DefaultService(){
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void sayName(){
        System.out.println("My name " + name + "!");
    }

    public void sayHello(String str) {
        System.out.println("Hello " + str +"!");
    }
}
