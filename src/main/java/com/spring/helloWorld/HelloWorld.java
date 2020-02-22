package com.spring.helloWorld;

public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("Hello world create now");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName function");
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello :" + name);
    }
}
