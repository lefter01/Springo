/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terry.extinct.models;

/**
 *
 * @author Workspace-Skarra
 */
public class RegisterSuperUserModel implements IUserModel{
    
    private String superUserPass;
    private String name;
    private String username;
    private int age;
    private String password;
    private String confirmPassword;
    
    public RegisterSuperUserModel()
    {
        //empty consutructor
    }


    public RegisterSuperUserModel(String superUserPass, String name, String username, int age, String password, String confirmPassword) {
        this.superUserPass = superUserPass;
        this.name = name;
        this.username = username;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public String getSuperUserPass() {
        return superUserPass;
    }

    public void setSuperUserPass(String superUserPass) {
        this.superUserPass = superUserPass;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    
}
