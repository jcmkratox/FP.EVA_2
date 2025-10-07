/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_SWITCH {
    public static void main(String[] args) {
        //SWITCH --> OPCION MULTIPLE
        Scanner captu = new Scanner (System.in );
        int dia ;
        System.out.println("dia de la semana en numero (1-7):");
        dia = captu.nextInt();
        //if (dia) 
        switch (dia) {
        case 1:
        System.out.println("lunes ");
        break;
        case 2:
        System.out.println("martes  ");
        break;
        case 3:
        System.out.println("miercoles  ");
        break;
        
        case 4:
        System.out.println("jueves  ");
        break;
        
        case 5:
        System.out.println("viernes  ");
        break;
        
        case 6:
        System.out.println("sabado  ");
        break;
        
        case 7:
        System.out.println("domingo  ");
        break;
        default:
            System.out.println("dato incorecto ");
        }
    }
    
}
