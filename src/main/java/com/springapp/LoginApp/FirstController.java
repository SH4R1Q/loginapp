package com.springapp.LoginApp;
import java.util.List;
import com.springapp.LoginApp.Services.LoginServices;
import com.springapp.LoginApp.dao.userDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @Autowired
    private LoginServices loginService;
    @PostMapping("/login")
    public userDetails postLogin(@RequestBody userDetails user){
        return this.loginService.searchUser(user);
    }
}
