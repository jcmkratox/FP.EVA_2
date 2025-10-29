/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_24_CICLO_INFINITO {

    /**
     * @param args the command line arguments
     */final static String USARIO = "ADMIN";
    final static String PWD = "ADMIN";
    public static void main(String[] args) {
       
     Scanner imput = new Scanner(System.in);
     String usu, contra; 

     while(true){
     System.out.println("ACCESO AL SISTEMA -------------");
     System.out.println("USARIO:");
     usu = imput.nextLine();
     System.out.println("CONTRAÑA ");
     contra = imput.nextLine();
     if(usu.equals(USARIO) && contra.equals(PWD))
     break;//termina el ciclo 
     }
     System.out.println("BIENVENIDO AL SISTEMA ");
     
    }
}
