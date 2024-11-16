/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;
/**
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {
        UserData user1 = new UserData(1234, 8766);
        UserData user2 = new UserData(1113, 8899);
        
        try{
            user1.login();
        } catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
        
        try{
            user2.login();
        }catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
        
        try{
            user2.login();
        }catch (LoginFailedException e){
            System.out.println(e.getMessage());
        }
    }
}
