/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Bulan
 */
public class AC implements InterfaceAC{

int statusAC;


public void HidupkanAC(){

if (statusAC == KEADAAN_MATI){

statusAC = KEADAAN_HIDUP;

System.out.println("Hidupkan AC! -> AC Hidup");

}else{

System.out.println("Hidupkan AC! -> AC Sudah Hidup Kok");
System.out.println("------------------------------------------"); }

}

public void MatikanAC(){

if (statusAC == KEADAAN_HIDUP){

statusAC = KEADAAN_MATI;

System.out.println("Matikan AC! --> AC Mati");

}else{

System.out.println("Matikan AC! --> AC Sudah Mati Kok"); 
System.out.println("------------------------------------------"); }

}
public void DinginkanAC(){

if (statusAC == KEADAAN_HIDUP){

statusAC = KEADAAN_MATI;

System.out.println("Atur Suhu AC! --> AC Suhu Dingin Aktif");

}else{

System.out.println("Atur Suhu AC! --> AC Dingin Diatur Suhu Normal"); 
System.out.println("------------------------------------------"); }

}
public void PanaskanAC(){

if (statusAC == KEADAAN_HIDUP){

statusAC = KEADAAN_MATI;

System.out.println("Atur Suhu AC! --> AC Suhu Panas Aktif");

}else{

System.out.println("Atur Suhu AC! --> AC Panas Diatur Suhu Normal"); 
System.out.println("------------------------------------------"); }

}
}