/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosamigos;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Numerosamigos {
static int a=0;
static int b=0;
static int c=0;
static int z=0;
static int i=0;
static int e=0;
static int f=0;

 static void inicio(){
     Scanner input = new Scanner (System.in);
     System.out.println(" Ingrese el primer numero");
     a=input.nextInt();
     System.out.println("ingrese el segundo numero");
     z=input.nextInt();
 }
static void proceso(){
    for (int d=1; d<=a/2; d++){
        b=a%d;
        if(b==0){
            e=e+d;
            System.out.println( e
                    + " ");
        }
    }
    for (int d=1; d<= z/2 ;d++){
	b=z%d;
	if (b==0){
	f= f+d;
	System.out.println(f
         + " ");
	}
    }
    if (a==f){
	if (z==e){
	System.out.println(" son numeros amigos");
	}
    }
    else{
	System.out.println(" no son numeros aigos");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
        proceso();
    }
    
}
