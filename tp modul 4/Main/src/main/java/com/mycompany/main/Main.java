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
        // buat objek dokter 
        Dokter dt1 = new Dokter("Maulana Mallik", "Mata");
        Dokter dt2 = new Dokter("Fahryan Tresno", "Gigi");
        Dokter dt3 = new Dokter("Priyagung Makmur", "Telinga");
        
        // buat objek pasien
        Pasien ps1 = new Pasien("Adli Bahri", 20);
        Pasien ps2 = new Pasien("Adam Rafif", 55);
        Pasien ps3 = new Pasien("Alif Taufiq", 37);
        
        // array pemesanan
        Pemesanan[] arrPemesanan = new Pemesanan[5];
        arrPemesanan[0] = new Pemesanan(dt1, ps1, "Selasa");
        arrPemesanan[1] = new Pemesanan(dt2, ps1, "Kamis");
        arrPemesanan[2] = new Pemesanan(dt2, ps2, "Selasa");
        arrPemesanan[3] = new Pemesanan(dt3, ps2, "Jumat");
        arrPemesanan[4] = new Pemesanan(dt1, ps3, "Senin");
        
        for(int i = 0; i < arrPemesanan.length; i++){
            System.out.printf("Urutan ke-%d\n", i+1);
            System.out.printf("Nama Dokter\t: %s\n", arrPemesanan[i].getDokter().getNama());
            System.out.printf("Spesialis\t: %s\n", arrPemesanan[i].getDokter().getSpesialis());
            System.out.printf("Nama Pasien\t: %s (%d)\n", arrPemesanan[i].getPasien().getNama(), arrPemesanan[i].getPasien().getUmur());
            System.out.printf("Hari\t\t: %s\n\n", arrPemesanan[i].getHari());
        }
    }
}
