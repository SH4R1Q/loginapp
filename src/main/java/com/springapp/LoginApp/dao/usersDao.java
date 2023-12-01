package com.springapp.LoginApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class usersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public boolean searchDB(String user, String pass){
        String query = "select username from users where username='"+user+"' AND password='"+pass+"'";
        try {
            List<userDetails> userName = jdbcTemplate.query(query, new RowMapper<userDetails>() {

                @Override
                public userDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
                    System.out.println(rs);
                    userDetails user = new userDetails();
                    user.setUserName(rs.getString(1));
                    return user;
                }
            });
            return !userName.isEmpty();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}
