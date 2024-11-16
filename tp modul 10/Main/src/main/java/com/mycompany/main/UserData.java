/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pc
 */
public class UserData {
    private int userid;
    private int password;
    private boolean isLoggedIn;
    
    public UserData(int userid, int password){
        this.userid = userid;
        this.password = password;
    }
    
    public void login() throws LoginFailedException{
        assert String.valueOf(userid).length() == 4 : "userid harus 4 digit";
        assert String.valueOf(password).length() == 4 : "password harus 4 digit";
        
        if(userid + password == 10000){
            isLoggedIn = true;
            System.out.println("Login successful for user " + userid);
        }else{
            isLoggedIn = false;
            throw new LoginFailedException("Login user " + userid + " gagal, telah gagal login " + 
                    (LoginFailedException.getFailedCounter(userid)+1) + " kali", userid);
        }
    }
}
