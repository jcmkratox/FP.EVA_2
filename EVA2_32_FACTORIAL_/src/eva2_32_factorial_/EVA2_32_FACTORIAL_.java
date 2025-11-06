/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_32_factorial_;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_32_FACTORIAL_ {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
    Scanner imput = new Scanner ( System.in);
    int valor , factorial = 1;
    String mensaje;
    
    
    System.out.println("valor que se quiere imprimir ");
    valor = imput.nextInt();
    
    for(int i = 1 ; i <= valor; i++){
    factorial = factorial * i ;
    }System.out.println("facotirial de " + valor +"="+ factorial );
    
 }
}
