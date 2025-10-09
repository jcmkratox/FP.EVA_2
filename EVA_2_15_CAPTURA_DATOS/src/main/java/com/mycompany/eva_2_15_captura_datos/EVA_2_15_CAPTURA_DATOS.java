/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author jcmkr
 */
public class EVA_2_15_CAPTURA_DATOS {

    public static void main(String[] args) {
    Scanner imput = new Scanner (System.in );
    int tama ;
    System.out.println("CUANTAS CALIFACIONESQUIERES CAPTURAR  ");
    tama = imput.nextInt();
    int califa[] = new int[tama ];
    for(int i = 0;i < califa .length; i++){
        System.out.println("calificacion " + i +":");
        califa[i] = imput.nextInt();
         }
    for (int i = 0; i < califa.length; i ++ ){
        System.out.println("[" + califa[i ] + "]");
    }
    //PROMEDIO DEL GRUPO?
    //SUMAR TODAS LAS CALIFICACIONES 
    int sumaCalifa = 0 ;
    for(int i = 0; i < califa.length ; i ++){
        sumaCalifa = imput.nextInt();
    }
    System.out.println("acumulado " + sumaCalifa);
    double promedio = sumaCalifa / califa.length;
    System.out.println("promedio " + promedio );
     }
}
