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
    public List<userDetails> searchUser(String user, String pass) {
        if(dbDao.searchDB(user,pass)){
            list = new ArrayList<>();
            list.add(new userDetails(user));
            return list;
        }
        list = new ArrayList<>();
        list.add(new userDetails(null));
        return list;
    }
}
