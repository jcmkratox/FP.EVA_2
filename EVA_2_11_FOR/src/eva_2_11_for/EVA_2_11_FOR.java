/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_11_for;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in );
        int rep ;
        String mensaje;
        System.out.println("mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticione :");
        rep = captu.nextInt();
        for(int i =1 ; i <= rep; i++ ){
            System.out.println(mensaje );
            //SOLICITAR DOS NUMERO S AL USARIO, IMPRIMIR LA LISTA 
            //ENTRE ESOS NUMEROS 
            //-3 Y 3 --> -3 -2 -1 0 1 2 3
            // EN ORDEN INVERSO 
            
        }
                
    }
    
}
