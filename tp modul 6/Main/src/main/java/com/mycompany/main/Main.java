/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {
        // membuat object
        SepedaMotor sp = new SepedaMotor("Hitam");
        HondaBaet hb = new HondaBaet("Biru");
        YamahaMoi ym = new YamahaMoi("Merah");
        LocalDateTime temp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String waktu = temp.format(formatter);
        
        // status awal
        System.out.println("Status Awal Sepeda Motor:");
        System.out.println(sp.jalan());
        
        System.out.println("Status Awal HondaBaet:");
        System.out.println(hb.jalan());
        
        System.out.println("Status Awal YamahaMoi:");
        System.out.println(ym.jalan());
        
        // status terbaru
        System.out.println("------------------------------------");
        System.out.println("Status terbaru Sepeda Motor:");
        sp.isiTangkiFull();
        System.out.println("Waktu saat ini: " + waktu);
        if(sp.jalan()){
            System.out.println(sp.CekKapanHabis());
        }
        
        System.out.println("Status terbaru HondaBaet:");
        hb.isiTangkiFull();
        System.out.println("Waktu saat ini: " + waktu);
        if(hb.jalan()){}
        
        System.out.println("Status Terbaru YamahaMoi:");
        ym.isiTangkiFull();
        System.out.println("Waktu saat ini: " + waktu);
        if(ym.jalan());
    }
}
