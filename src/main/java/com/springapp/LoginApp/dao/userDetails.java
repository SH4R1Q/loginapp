package com.springapp.LoginApp.dao;

public class userDetails {
    private String userName;

    public userDetails(String userName){
        this.userName = userName;
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
    @Override
    public String toString() {
        return "[user {username ="+userName+"}]";
    }
}
