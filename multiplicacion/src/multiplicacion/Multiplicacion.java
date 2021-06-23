/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Multiplicacion {
    static int a=6;
    static int b=9;
    static int c=5;
    static int d=0;
    static int e;
static void leer(){
        Scanner input= new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        a=input.nextInt();
        System.out.println("ingrese el segundo numero");
        b= input.nextInt();
        System.out.println("ingrese el numero limite");
        c= input.nextInt();
    }
static void multiplicacion(){
     while (a<=b){
             for(int i=0;i<=c;i++){
                e=a*i;
                System.out.print(" la multiplicacion es:  " 
                + a
                +" x "
                +i 
                +" = "
                +e
                +"\n");
                
            }
        a++;
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leer();
        multiplicacion();     
    }
    }
