/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA_2_17_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int matriz[][]= new int[3][4];
      //int cubo[][] = new int [2][2][2]
      matriz[0][0]= 100;
      matriz[0][1]= 200;
      matriz[0][2]= 300;
      matriz[0][3]=  400 ;
      System.out.println(matriz.length);
      System.out.println(matriz[0].length);
      System.out.println(matriz[1].length);
      System.out.println(matriz[2].length);
      // ciclos anidados
       for (int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < 4; j++){
           System.out.print("[" + matriz[i][j] + "]");
       }    
            System.out.println();
       }
           
    }
    
}
