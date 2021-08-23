package com.example.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionTestController {

    @RequestMapping(value="/test")//파라미터를 받을 때 이렇게도 받을 수 있다.
    public String test3(@RequestParam("id") String id) throws Exception{
        System.out.println(id);
        return "test";
    }

    @RequestMapping(value = "/order1")
    public String test1(HttpSession session) throws Exception {
        Integer ordercnt=(Integer)session.getAttribute("ordercnt");
 
        if ( ordercnt !=null ){
            ordercnt += 1 ;
        }else {
            ordercnt = 0 ;
        }
 
        session.setAttribute("ordercnt", ordercnt) ;
        return "order";
    }

    // 위와 아래 예제 동일
    @RequestMapping(value = "/order2")
    public String test2(@SessionAttribute("ordercnt") Integer ordercnt,HttpSession session) throws Exception {

        if ( ordercnt !=null ){
            ordercnt += 1 ;
        }else {
            ordercnt = 0 ;
        }

        session.setAttribute("ordercnt", ordercnt) ;
        return "order";
    }
}