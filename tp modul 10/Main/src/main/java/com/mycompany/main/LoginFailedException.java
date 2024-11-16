/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.HashMap;

/**
 *
 * @author pc
 */
public class LoginFailedException extends Exception {
    private static HashMap<Integer, Integer> failedcount = new HashMap<>();
    private int userid;
    
    public LoginFailedException(String msg, int user){
        super(msg);
        userid = user;
        
        if(failedcount.containsKey(user)){
            failedcount.put(user, failedcount.get(user) + 1);
        }else {
            failedcount.put(user, 1);
        }
    }
    
    public int getUserid(){
        return userid;
    }
    
    public static int getFailedCounter(int user){
        return failedcount.getOrDefault(user, 0);
    }
}
