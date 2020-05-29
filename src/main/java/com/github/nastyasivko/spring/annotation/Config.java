package com.github.nastyasivko.spring.annotation;

import com.github.nastyasivko.spring.Profiling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("config")
public class Config implements NameUser{
    private Long id;
    private String name;

    @Autowired
    public DefaultService getDefaultService(){
        return new DefaultService();
    }

    @Override
    public void sayHi(){
        System.out.println("Hello user from config!");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Config() {
    }

    public Config(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void infoUser(){
        System.out.println("id: " + id + " , " + name);
    }

}
