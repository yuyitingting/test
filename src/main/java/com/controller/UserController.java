package com.controller;

import com.bean.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("login")
    public String login(User user, Model model){
        if(user.getUsername()!=null && user.getPassword()!=null&&!"".equals(user.getPassword())&&!"".equals(user.getUsername())){
            User user1 = userService.checkUsernameAndPassword(user.getUsername(), user.getPassword());
            if(user1!=null){
                return "/success.jsp";
            }
            else
            {
                model.addAttribute("state","用户名或密码错误，请重新登录！");

            }

        }
        else{
            model.addAttribute("state","用户名和密码不能为空!");
        }
        return "/login.jsp";
    }
}
