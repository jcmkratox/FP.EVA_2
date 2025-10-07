/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_switch;

/**
 *
 * @author invitado
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String valor = "martes  "; 
    switch (valor ){
        case "lunes ":
            System.out.println(1);
            break;
        case "martes  ":
            System.out.println(2);
            break;
        case "miercoles ":
            System.out.println(3);
            break;
        default:
            System.out.println("valor incorecto ");
    }   
    
    }
    
}
