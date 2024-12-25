/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Bulan
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika Mat = new Matematika();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Pertambahan 20 + 20 = " + Mat.tambah(20,20));
        System.out.println("Pengurangan 10 - 5 = " + Mat.kurang(10,5));
        System.out.println("Perkalian 10 x 20 = " + Mat.kali(10, 20));
        System.out.printf("Pembagian (21 : 2)= %.1f%n" , Mat.bagi(21, 2));
        System.out.println("---------------------------------------------------------------------");
    }
}