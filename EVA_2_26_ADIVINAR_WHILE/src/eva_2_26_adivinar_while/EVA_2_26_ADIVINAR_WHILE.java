/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_26_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_26_ADIVINAR_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
    int valor = -0, adivina ;
    while(valor != -1 ){
        adivina = (int)(Math.random()*5);
        System.out.println("adivina el numero. -1 para terminal ");
        valor = captu.nextInt();
        if(valor == adivina )
            System.out.println("avidinaste ");
    }
    
}
}