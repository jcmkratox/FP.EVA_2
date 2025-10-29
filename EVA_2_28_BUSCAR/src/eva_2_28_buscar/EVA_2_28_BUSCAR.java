/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_28_buscar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_28_BUSCAR {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int valor;
       int valores[] = new int[10];
       for(int i = 0; i < valores.length; i ++){
           valores[i] = (int)(Math.random()* 100);
       } for(int i = 0; i < valores.length; i ++){
          System.out.print("{" + valores[i] + "}");
       }
       System.out.println("");
       System.out.println("valora a buscar ");
       valor = captu.nextInt();
       //BUSCAR 
       for(int i = 0; i < valores.length; i ++){
           if(valor == valores[i ]){
           System.out.print("valor encontrado ");
           System.out.print("posicion:" + i);
           break;
       }
           
       }
    }
    
}
