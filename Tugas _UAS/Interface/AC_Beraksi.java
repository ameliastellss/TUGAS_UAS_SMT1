/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Bulan
 */
public class AC_Beraksi {
public static void main(String[] args){
AC ACKamar = new AC();


System.out.println("Status AC Saat Ini: Mati");
ACKamar.HidupkanAC(); 

ACKamar.MatikanAC(); 
ACKamar.MatikanAC(); 

ACKamar.HidupkanAC(); 
ACKamar.HidupkanAC(); 

ACKamar.DinginkanAC(); 
ACKamar.DinginkanAC(); 

ACKamar.HidupkanAC(); 

ACKamar.PanaskanAC(); 
ACKamar.PanaskanAC(); 

}

}
