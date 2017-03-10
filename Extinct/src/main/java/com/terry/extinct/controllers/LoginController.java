/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.controllers;

import com.terry.extinct.models.UserModel;
import com.terry.extinct.services.LoginService;
import java.awt.PageAttributes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sw-user2
 */
@RestController
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(method = RequestMethod.POST , value = "/AddUser")
    public String AddUser(@RequestBody UserModel user)
    {
       System.out.println("new user");
       System.out.println(user.getUsername());    
       System.out.println(user.getPassword()); 
       
       try
       {
           loginService.addUser(user);
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }      
       
       return "added a new user";
    }
}
