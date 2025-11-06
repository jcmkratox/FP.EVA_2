/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner imput = new Scanner ( System.in);
    int retito , cuenta = 100000;
    
      do{
         System.out.println("valor que se quiere imprimir ");
    retito  = imput.nextInt();
    cuenta = cuenta - retito ;
    System.out.println("saldo "+  cuenta );
      }while(cuenta > 0 );
    }
    
}
