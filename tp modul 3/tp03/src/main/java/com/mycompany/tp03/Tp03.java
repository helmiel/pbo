/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp03;

/**
 *
 * @author pc
 */

class Prodi{
    String nama;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
}

class Mahasiswa{
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

public class Tp03 {

    public static void main(String[] args) {
        // buat object prodi
        Prodi pr1 = new Prodi();
        pr1.setNama("Informatika");
        
        Prodi pr2 = new Prodi();
        pr2.setNama("Rekayasa Perangkat Lunak");
        
        // buat object mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Heritsam Yuniawan");
        mhs1.setProdi(pr1);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Nugroho Rahmanto");
        mhs2.setProdi(pr2);
        
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
