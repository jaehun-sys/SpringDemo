package com.example.controller;

import com.example.service.UserService;
import com.example.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UserController2 {
    @Autowired
    UserService userService;
   
    @RequestMapping(value = "/get_user_list")
    public String getUserList(Model model) throws Exception {
        List<UserVO> userlist = userService.getUserList();
        model.addAttribute("userlist", userlist);
        return "userlist";
    }
    
    @RequestMapping(value = "/get_user")
    public String getUser(@ModelAttribute UserVO user, Model model) throws Exception {
        System.out.println("입력받은 id = "+user.getId());
        UserVO result = userService.getUser(user );
        model.addAttribute("id", result.getId());
        model.addAttribute("name", result.getName() );
        return "userInfo";
    }
}
