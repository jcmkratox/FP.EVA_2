/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_29_continue;

/**
 *
 * @author invitado
 */
public class EVA_2_29_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //CONTINE --> DETIENE LA ITERACION ( REPETICION 
        //IMPRIMIR NUMEROS PARES 
        for (int i = 0; i <100; i++){
            int resi = i % 2;
            if(resi != 0)
        System.out.print(i + "-");
        continue ; // aqui se interrupe
    }
    }
}
