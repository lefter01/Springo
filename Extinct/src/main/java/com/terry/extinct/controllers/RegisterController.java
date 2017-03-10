/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.controllers;

import com.terry.extinct.models.IUserModel;
import com.terry.extinct.services.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Workspcace-Skarra
 */
@RestController
public class RegisterController {
    
    @Autowired
    private RegisterUserService registerUserService;
    
    
    @RequestMapping(value = "/Register", method = RequestMethod.POST, produces = "application/json; charset=utf-8", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody IUserModel tmp) {
        registerUserService.registerUser(tmp);
    }
    
}
