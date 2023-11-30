package com.springapp.LoginApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @PostMapping("/")
    public String postLogin(@RequestParam("username") String user, @RequestParam("password") String pass, Model model){
        if(user.equals("shariq") && pass.equals("122333")) {
            model.addAttribute("name", user);
            return "homepage";
        }
        else
            return "login";
    }
}
