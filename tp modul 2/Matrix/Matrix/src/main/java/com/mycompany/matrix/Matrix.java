/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix;

import java.util.Scanner;
        
/**
 *
 * @author pc
 */
public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Perkalian Matriks nxn");
        System.out.print("n: ");
        int n = input.nextInt();
        
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] matrixHasil = new int[n][n];
              
        // input nilai matrix1
        System.out.println("Isi matrix 1:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix1[i][j] = input.nextInt();
            }
        }
        
        // input nilai matrix2
        System.out.println("Isi matrix 2:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix2[i][j] = input.nextInt();
            }
        }
        
        // perkalian matrix nxn
        System.out.println("Hasil Perkalian:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrixHasil[i][j] = 0;
                for(int k = 0; k < n; k++){
                    matrixHasil[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            System.out.print(matrixHasil[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
