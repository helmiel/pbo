/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp03;

/**
 *
 * @author pc
 */
public class Mahasiswa {
    String nama;
    Prodi prodi;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getProdi(){
        return this.prodi.getNama();
    }
    
    public void displayMahasiswa(){
        System.out.println("\nNama Mahasiswa : " + this.getNama());
        System.out.println("Dari Prodi : " + this.getProdi());
    }
}
