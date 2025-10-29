/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_21_DO_WHILE_PWD {

    final static String USARIO = "ADMIN";
    final static String PWD = "ADMIN";
    public static void main(String[] args) {
        
     Scanner imput = new Scanner(System.in);
     String usu, contra; 
     do{
     System.out.println("ACCESO AL SISTEMA -------------");
     System.out.println("USARIO:");
     usu = imput.nextLine();
     System.out.println("CONTRAÑA ");
     contra = imput.nextLine();
     System.out.println("BIENVENIDO AL SISTEMA ");
     
     }while(!(usu.equals(USARIO) && contra.equals(PWD)));
    }
    
}
