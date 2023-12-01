package com.springapp.LoginApp;

import com.springapp.LoginApp.dao.usersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @Autowired
    private usersDao dbDao;
    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @PostMapping("/")
    public String postLogin(@RequestParam("username") String user, @RequestParam("password") String pass, Model model){
        dbDao.searchDB(user,pass);
        return "homepage";
    }
}
