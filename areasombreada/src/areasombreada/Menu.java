/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasombreada;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */

public class Menu extends Circunferencia{
     public int a;
     
     public Menu(){
        System.out.println("soy el constructor de menu");
        a=0;
     }
    
    public void menu(){
        
    Scanner input = new Scanner (System.in);
    System.out.println(" bienvenido al programa de areas");
    System.out.println(" 1. ver el area del cuadrado");
    System.out.println(" 2. ver el area del circulo");
    System.out.println(" 3. ver el area sombreada");
    System.out.println(" 4. ver el volumen de la esfera ");
    a= input.nextInt();
    
    if (a==1){
        Cuadrado c4= new Cuadrado();
        c4.area();
            
    }
    if (a==2){//
     Circunferencia c2= new Circunferencia();
     //super.Setcolor(super.Colores(c2.area()));
    }
    if(a==3){
        Operacion op2= new Operacion();
        op2.llamar();
    }
    if(a==4){//
        Esfera esf = new Esfera();
     //   esf.volumen();
    }

}
}
    
