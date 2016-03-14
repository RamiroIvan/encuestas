package com.certuit.limesurvey.model;

/**
 * Created by andre on 3/13/16.
 */
public class User {
    public String getUsername() {
        return username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username="";
    private String password="";
}
