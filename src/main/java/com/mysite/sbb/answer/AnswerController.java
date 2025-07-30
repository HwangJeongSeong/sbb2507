package com.mysite.sbb.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnswerController {

    @GetMapping("/answer/list")
    @ResponseBody
    public String list() {

    return "answer list";
    }
}
