package com.springapp.LoginApp.Services;
import java.util.ArrayList;
import java.util.List;
import com.springapp.LoginApp.dao.userDetails;
import com.springapp.LoginApp.dao.usersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServicesImpl implements LoginServices{
    @Autowired
    private usersDao dbDao;
    List<userDetails> list;
    @Override
    public userDetails searchUser(userDetails user) {
        if(dbDao.searchDB(user.getUserName(), user.getPassword())){
            return new userDetails(user.getUserName(),"OK");
        }
        return new userDetails(null,null);
    }
}
