package com.springapp.LoginApp.dao;

public class userDetails {
    private String userName;
    private String password;

    public userDetails(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public userDetails(){
        super();
    }
    // getters and setters method
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName= userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password= password;
    }
    @Override
    public String toString() {
        return "[user {username ="+userName+",password ="+password+"}]";
    }
}
