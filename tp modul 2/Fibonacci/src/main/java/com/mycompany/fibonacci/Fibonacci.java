/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Fibonacci {

    public static void main(String[] args) {
        int a,b,temp;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        
        a = 0;
        b = 1;
        
        for(int i = 1; i <= n; i++){
            System.out.print(b + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}
