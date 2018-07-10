package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OurPageController {

    private String ourPage;

    @RequestMapping(value = "/OurPage", method = RequestMethod.GET)
    public String OurPage() {
        return "OurPage";

    }

    public void setOurPage(String OurPage) {
        ourPage = OurPage;
    }

    public String getOurPage() {
        return ourPage;
    }
}
