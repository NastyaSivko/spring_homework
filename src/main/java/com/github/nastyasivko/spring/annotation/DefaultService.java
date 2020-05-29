package com.github.nastyasivko.spring.annotation;

public class DefaultService {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void sayHello(String str) {
        System.out.println("Hello " + str +"!");
    }

    public void sayHi(){
        System.out.println("Hi bean from config for list!");
    }
}
