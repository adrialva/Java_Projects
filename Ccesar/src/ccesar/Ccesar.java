/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccesar;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Ccesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
        numero oj1= new numero();
        Letras oj2 = new Letras(); 
        int a;
        System.out.println("    **Menu**" );
        System.out.println("  1. desea ingresar un numero" );
        System.out.println("  2. desea ingresar una palabra" );
        a=input.nextInt();
        if (a==1){
        oj1.Igreso();
        oj1.modificado();
        }
        if (a==2){
        oj2.Igreso();
        oj2.modificado();
        }
        // TODO code application logic here
    }
    
}
