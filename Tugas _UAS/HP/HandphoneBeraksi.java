/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HP;

/**
 *
 * @author Bulan
 */
public class HandphoneBeraksi {
     public static void main(String[] args){
     Handphone hpstella = new Handphone();
        
        hpstella.hidupkan= "Handphone Hidup";
        hpstella.lakukanPanggilan= "Kring, kring, kring... panggilan dilakukan";
        hpstella.kirimSMS= "Dung, dung... SMS berhasil terkirim";
        hpstella.matikan= "Handphone mati...";
         
        System.out.println("Menghidupkan Handphone: "+ hpstella.hidupkan);
        System.out.println("Melakukan Panggilan: "+ hpstella.lakukanPanggilan);
        System.out.println("Mengirimkan Pesan: "+ hpstella.kirimSMS);
        System.out.println("Mematikan Handphone: "+ hpstella.matikan);
}
}