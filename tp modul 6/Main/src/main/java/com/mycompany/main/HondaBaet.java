/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author pc
 */
public class HondaBaet extends SepedaMotor{
    public HondaBaet(String warna){
        super(warna);
        this.ukuranTangki = 4;
    }
    
    @Override
    public boolean jalan(){
        if(super.jalan()){
            System.out.println("Moto Baet akan habis bensin pada " + super.CekKapanHabis());
            return true;
        }
        return false;
    }
}
