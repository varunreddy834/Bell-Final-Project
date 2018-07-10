package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrdersController {


    private String orders;

    @RequestMapping(value = "/Orders", method = RequestMethod.GET)
    public String Orders() {
        return "Orders";

    }

    public void setOrders(String Orders) {
        orders = Orders;
    }

    public String getOrders() {
        return orders;
    }
}


