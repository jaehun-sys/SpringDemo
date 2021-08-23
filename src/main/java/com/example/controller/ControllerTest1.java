package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controllertest")
public class ControllerTest1 {
    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model){    //함수 이름은 아무거나
        System.out.println("test");
        model.addAttribute("name","홍길동"); //화면에다 데이터를 보내고
        return "test"; //templates/test.html을 응답
    }
}
