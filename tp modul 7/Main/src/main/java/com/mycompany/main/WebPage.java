/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pc
 */
public abstract class WebPage implements Loginable{
    private String webTitle;
    protected String loggedUsername;
    
    public WebPage(String title){
        this.webTitle = title;
    }
    
    protected void showHeader(){
        System.out.println("######################################");
        System.out.println("### " + this.webTitle + " ##");
        System.out.println("#----------------------------------------------##");
    }
    
    protected void showFooter(){
        System.out.println("#----------------------------------------------##");
        System.out.println("# Created by Helmi Efendi Lubis ##");
        System.out.println("######################################");
    }
    
    protected abstract void showMainPage();
    
    @Override
    public void login(String input){
        this.loggedUsername = input;
    }
    
    public void showFullPage(){
        showHeader();
        showMainPage();
        showFooter();
    }
}