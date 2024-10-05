/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pc
 */
public class Dokter {
    private String nama;
    private String spesialis;
    
    public Dokter(String nama, String spesialis){
        this.nama = nama;
        this.spesialis = spesialis;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setSpesialis(String nama){
        spesialis = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getSpesialis(){
        return spesialis;
    }
}
