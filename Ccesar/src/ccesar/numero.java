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
public class numero {
    private int a[]= new int[7];
    
    void Igreso(){
   Scanner input = new Scanner (System.in);
    System.out.println(" Digite los digitos de su numero ");
    for(int i=0; i<7;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		a[i]=input.nextInt();
	}
    }
    void modificado(){
        int c;
        for(int i=0; i<7;i++){
        c=a[i]+3;
        if(c==10){
            a[i]=1;
           System.out.println(a[i]); 
        }else{
           if(c==11){
            a[i]=2;
           System.out.println(a[i]); 
           }else{
           if(c==12){
            a[i]=3;
           System.out.println(a[i]); 
           }
           else{
            System.out.println(c);
        }
        }
        }
        
        }
    }
}
