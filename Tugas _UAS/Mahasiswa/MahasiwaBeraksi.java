/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author Bulan
 */
public class MahasiwaBeraksi {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.membaca= "Mahasiswa Membaca Diperpustakaan";
        mhs.nyontek= "Mahasiswa Menyontek saat Ujian";
        mhs.modifikasi= "Mahasiswa Memodifikasi Komputer";
        
        System.out.println("Kegiatan Mahasiswa: "+ mhs.membaca);
        System.out.println("Kecurangan Mahasiswa: "+ mhs.nyontek);
        System.out.println("Aktivitas Mahasiswa: "+ mhs.modifikasi);
    }
}

