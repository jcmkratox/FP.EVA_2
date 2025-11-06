/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_31_priramide;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_31_PRIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner imput = new Scanner ( System.in);
    int valor ;
    String mensaje;
    
    
    System.out.println("valor que se quiere imprimir ");
    valor = imput.nextInt();
    
    for(int i = valor  ; i >= 1; i--){
    for(int j = 1 ; j <= i; j++){
        System.out.print("*"); 
        }System.out.println(); 
    }
    }
}
