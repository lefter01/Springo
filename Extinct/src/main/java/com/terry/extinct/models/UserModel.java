/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.models;

/**
 *
 * @author sw-user2
 */
public class UserModel {
    
    private String username;
    private String password;
    
    public UserModel()
    {
        
    }
    public UserModel(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
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
    
    
}
