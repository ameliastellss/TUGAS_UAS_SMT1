/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Bulan
 */
public class Bank {
    int saldo;
    public Bank (int saldo) {

        this.saldo = saldo;
    }
    void getSaldo (int saldo){
        System.out.println("Selamat Datang Di Bank");
        System.out.println("Saldo Saat Ini =Rp." + saldo);
        System.out.println("----------------------------------");
    }
    void simpanUang(int simpanUang){
        saldo += simpanUang;
        System.out.println("\nSimpan Uang =Rp." + simpanUang);
        System.out.println("Saldo Saat Ini =Rp." + saldo);
        System.out.println("----------------------------------");
    }
    void ambilUang (int ambilUang){
        saldo -= ambilUang;
        System.out.println("\nAmbil Uang =Rp." + ambilUang);
        System.out.println("Saldo Saat Ini =Rp." + saldo);
        System.out.println("----------------------------------");
}
}