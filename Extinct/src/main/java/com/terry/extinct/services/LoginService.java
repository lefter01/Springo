/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.services;

import com.terry.extinct.models.UserModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Skarra
 */
@Service
public class LoginService 
{
    private List users = new ArrayList<UserModel>();
    
    public void addUser(UserModel user)
    {
        users.add(user);
    }
    public List getUsers() {
        return users;
    }
    
}
