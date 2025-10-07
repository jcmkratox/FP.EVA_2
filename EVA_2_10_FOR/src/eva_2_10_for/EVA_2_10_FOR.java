/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_10_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPRIMIR DEL 1 AL 20 
    for(int i = 1; i <= 20; i ++){
        System.out.print(i + "-");
    }
      System.out.println();
    for(int i = 20; i >= 1; i --){
        System.out.print(i + "-");
    }
        //IMPRIMIR LOS PARES DE 0 AL 100 
        //0-2-4-6-8...98 -100
        //+= ,-=,/=, *=
       System.out.println();
    for(int i = 0; i <= 100; i+=2 ){
            System.out.print(i +"-");
    }
            //imprimir en orden inverso 
      System.out.println();
    for(int i = 100; i >= 0; i-=2 ){
            System.out.print(i +"-");
    //SOLICITAR DOS NUMERO S AL USARIO, IMPRIMIR LA LISTA 
            //ENTRE ESOS NUMEROS 
            //-3 Y 3 --> -3 -2 -1 0 1 2 3
            // EN ORDEN INVERSO +
            
    }
    Scanner captu = new Scanner (System.in );
    int rep1, rep2; 
    String mensaje ;
    System.out.println();
    System.out.println("mensaje a repetir");
        mensaje = captu.nextLine();
    System.out.println("Cantidad de repeticione iniciales:");
        rep1 = captu.nextInt();
    System.out.println("Cantidad de repeticione finales :");
        rep2 = captu.nextInt();
        for(int i =rep1 ; i <= rep2; i++ ){
            System.out.println( i + mensaje );
        }
    }
}
    
    
    
     
   
    
    

