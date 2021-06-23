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
public class Letras {
   char d[] = new char[7];
    
    void Igreso(){
   Scanner input = new Scanner (System.in);
    System.out.println(" Digite las letras de su palabra ");
    for(int i=0; i<7;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		d[i]=input.next().charAt(0);
	}
    }
    void modificado(){
        char c;
        int x=0;
        for(int i=0; i<7;i++){
            x=(int)d[i];
            x=x+3;
            c= (char) (x);
            System.out.print(c);
        }
    }
    void verificacion(){
    System.out.print("  Este es el codigo digitado: ");
    for (int i=0; i<7; i++){
        System.out.println(d[i]+" ");
    }
}
}
