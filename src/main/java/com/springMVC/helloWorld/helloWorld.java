package com.springMVC.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWorld {

    @RequestMapping("/hello")
    public String testHelloWorld(){
        System.out.println("Hello World");
        return "success";
    }
}
