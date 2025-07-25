package com.mysite.sbb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

    @GetMapping("hello")
    @ResponseBody
    public String showHello() {
        return "Hello World";
    }
}
