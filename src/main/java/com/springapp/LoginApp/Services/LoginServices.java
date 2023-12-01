package com.springapp.LoginApp.Services;
import java.util.List;
import com.springapp.LoginApp.dao.userDetails;

public interface LoginServices {
    public List<userDetails> searchUser(String user, String pass);
}
