/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaCanggih;

/**
 *
 * @author Bulan
 */
public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih Mat = new MatematikaCanggih();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Pertambahan 20 + 20 = " + Mat.tambah(20,20));
        System.out.println("Pengurangan 10 - 5 = " + Mat.kurang(10,5));
        System.out.println("Perkalian 10 x 20 = " + Mat.kali(10, 20));
        System.out.printf("Pembagian (21 : 2)= %.1f%n" , Mat.bagi(21, 2));
        System.out.printf("Modulus (3.4 : 4.9)= %.1f%n" , Mat.modulus(3.9, 4.9));
        System.out.println("---------------------------------------------------------------------");
    }
}