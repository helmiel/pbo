/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cobajurnal;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Cobajurnal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][];

        System.out.println("Nilai A: ");
        int a = input.nextInt();
        matrix[0] = new int[a];
        System.out.println("Nilai B: ");
        int b = input.nextInt();
        matrix[1] = new int[b];
        System.out.println("Nilai C: ");
        int c = input.nextInt();
        matrix[2] = new int[c];
        System.out.println("Nilai D: ");
        int d = input.nextInt();
        matrix[3] = new int[d];
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i ==0){
                    matrix[i][j] = (5 * (j+1));
                }else if(i == 1){
                    matrix[i][j] = (int)(Math.pow(j+2, 2));
                }else if(i==2){
                    matrix[i][j] = 3 + (2*j); 
                }else if(i==3){
                    matrix[i][j] = 3+j;
                }
            }
            switch(i){
                case 0:
                    System.out.print("\nIsi Nilai A: ");
                    break;
                case 1:
                    System.out.print("\nIsi Nilai B: ");
                    break;
                case 2:
                    System.out.print("\nIsi Nilai C: ");
                    break;
                case 3:
                    System.out.print("\nIsi Nilai D: ");
                    break;
                }
            for(int k =0; k < matrix[i].length; k++){
                System.out.print(matrix[i][k] + " ");
            }
        }
        System.out.println("\nMasukkan nilai yang ingin dicari: ");
        int n = input.nextInt();
        int found = -1;
        while(n != 0){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if(n == matrix[i][j]){
                        found += 1;
                        System.out.println(n + " berada di: ");
                        System.out.println("baris " + i + " kolom " + j);
                    }
                }
            }
            if(found == -1){
                System.out.println(n + " Tidak ada dalam matrix");
            }
            System.out.println("Masukkan nilai yang ingin dicari: ");
            n = input.nextInt();
        }
        
    }
}
