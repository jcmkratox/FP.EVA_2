/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_32_factorial;

import java.util.Scanner;

public class EVA2_32_FACTORIAL {

    public static void main(String[] args) {
       Scanner imput = new Scanner (System.in);
       int factorial, num ; 
       int fac ; 
      System.out.println("numero que se quiere factorial");
      num = imput.nextInt();
      fac = 5 ; 
      for(int i =num  ; i <= fac ; i-- ){
      System.out.println( i );
      System.out.println(fac);
      System.out.println( num );
      break; 
    }
    }
}
