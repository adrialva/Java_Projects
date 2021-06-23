/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjeta2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Ingreso {
      public void menu(){
     Scanner input = new Scanner (System.in);
    int w;
    System.out.println( "    **Bienvenido al programa de verificacion de tarjeta**");
    System.out.println("    1. Saber cual es el codigo de control de su tarjeta");
    System.out.println( "   2. Saber si su codigo tarjeta es correcto o no");
    System.out.println( "   3. Saber que tipo de tarjeta tiene ");
    w=input.nextInt();
    if (w==1){
        Tarjeta2 o2= new Tarjeta2();
        o2.entrar1();
        o2.final_1(o2.arreglos());
            
    }
    if (w==2){
        Tarjeta2 o2= new Tarjeta2();
        o2.entrar2();
        o2.final_2(o2.arreglos());
            
    }
    if (w==3){
        Tarjeta2 o2= new Tarjeta2();
        o2.entrar1();
        o2.saber();
            
    }
}
      
        }
