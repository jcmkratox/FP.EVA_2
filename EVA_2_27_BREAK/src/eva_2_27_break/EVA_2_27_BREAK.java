/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_27_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_27_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
    int valor , adivina ;
    do{
        adivina = (int)(Math.random()*5);
        System.out.println("adivina el numero. -1 para terminal ");
        valor = captu.nextInt();
        if(valor == adivina )
            System.out.println("avidinaste ");
        else if(valor != -1){
            System.out.println("Gracias por jugar ");
        break;// termina la ejecucion del ciclo 
        }else {
            System.out.println("no avidinaste ");
        }  
    } while(true );//CONDICION PARA REPETIR (TRUE )
    }
    
}
