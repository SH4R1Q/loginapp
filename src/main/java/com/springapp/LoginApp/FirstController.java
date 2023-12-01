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
    @PostMapping("/login/{user}/{pass}")
    public List<userDetails> postLogin(@PathVariable String user, @PathVariable String pass){
        return this.loginService.searchUser(user,pass);
    }
}
