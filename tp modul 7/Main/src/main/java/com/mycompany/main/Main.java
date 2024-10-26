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
        DashboardPage dp = new DashboardPage("Dashboard Page");
        HomePage hp = new HomePage("HomePage");
        
        System.out.println("Sebelum Login: ");
        // dashboard
        dp.showFullPage();
        System.out.println();
        // homepage
        hp.showFullPage();
        
        System.out.println("\nSetelah Login:");
        dp.login("Helmi Efendi Lubis");
        dp.showFullPage();
        
        System.out.println();
        hp.login("Helmi Efendi Lubis");
        hp.showFullPage();
        
    }
}
