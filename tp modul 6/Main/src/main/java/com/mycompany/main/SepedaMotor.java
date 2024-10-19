/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author pc
 */
public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    public SepedaMotor(String warna){
        this.warnaMotor = warna;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }
    
    public void isiTangkiFull(){
        this.waktuIsiBensin = LocalDateTime.now();
    }
    
    public String CekKapanHabis(){
        LocalDateTime waktu = this.waktuIsiBensin.plusHours(this.ukuranTangki);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return waktu.format(formatter);
    }
    
    public boolean jalan(){
        if(this.waktuIsiBensin == null){
            System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
            return false;
        }else{
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
}
