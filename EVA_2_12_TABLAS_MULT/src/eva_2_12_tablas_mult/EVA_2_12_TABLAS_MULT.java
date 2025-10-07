 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_12_tablas_mult;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_12_TABLAS_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       int valor;         
       System.out.println("tabla de multiplicar ");
       valor = captu.nextInt();
       for(int i = 1; i <= 10; i++){
       int mult = valor * i ;
       System.out.println(valor + "x" +  i + "=" + mult );
       
       }
    }
    
}
