package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContactUsController {

    private int contactUs;

    public int getContactUs() {
        return contactUs;
    }

    public void setContactUs(int contactUs) {
        this.contactUs = contactUs;
    }

    @RequestMapping(value = "/ContactUs", method = RequestMethod.GET)
    public String ContactUs() {
        return "ContactUs";

    }


}




