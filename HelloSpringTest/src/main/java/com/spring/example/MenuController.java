package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
    private String menu;

    @RequestMapping(value="/Menu",method = RequestMethod.GET)
    public String Menu() {
    return "Menu";

}


    public void setMenu(String Menu) {
        menu = Menu;
    }

    public String getMenu() {
        return menu;
    }
}
