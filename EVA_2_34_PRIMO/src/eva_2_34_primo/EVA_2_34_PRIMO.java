/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_34_primo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_34_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner ( System.in);
    int valor  ;
    String mensaje;
    boolean esPrimo = true ; 
    
    System.out.println("INTRODUCE EL VALOR  ");
    valor = imput.nextInt();
    
    for(int i = 2 ; i <= valor; i++){
        int resu = valor % i ;
        if(resu == 0 ){// no es un numero primo 
            esPrimo = false;  
                  break ;
                            
            
        }
    }
    if(esPrimo )
        System.out.println( "es primo ");
    
    }
    
}
