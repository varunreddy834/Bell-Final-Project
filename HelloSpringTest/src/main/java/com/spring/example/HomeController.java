package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {

    private String message;


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello() {
        System.out.println("inside hello method ");
        return "Home";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }



}