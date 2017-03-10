/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.services;

import com.terry.extinct.models.IUserModel;
import com.terry.extinct.models.RegisterSimpleUserModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author Workspace-Skarra 
 */
@Service
public class RegisterUserService {
        
    IUserModel usa;
    
    public void registerUser( IUserModel user )
    {
       user = new RegisterSimpleUserModel();
       
        
       user.getUsername();
    }

}
