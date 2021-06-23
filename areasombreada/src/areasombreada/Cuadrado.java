/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasombreada;

import java.util.Scanner;

public class Cuadrado implements IFigura {
 public double acuadrado;
 public float lado1;
 public float lado2;
 public double tamaño;
 public String color;
  public Cuadrado(float lado, float lado2){
      this.lado1=lado;
      this.lado2=lado2;
  }
  public Cuadrado(){
      acuadrado=0;
      lado1=0;
      lado2=0;
      System.out.println("Soy el constructor de cuadrado ");
  }
  @Override
    public double area(){
    Scanner input = new Scanner (System.in);
    System.out.println(" ingrese el lado del cuadrado");
    lado1= input.nextFloat();
    System.out.println(" ingrese el otro lado del cuadrado");
    lado2= input.nextFloat();
    acuadrado = lado1*lado2;
    System.out.println("el area del cuadrado es:"+ acuadrado);
   
    return acuadrado;
    }
    public double Tamaño2 (double acuadrado){
        tamaño=acuadrado+3;
        return tamaño; 
    }
    public String color(double tamaño){
        if (tamaño <=5){
            color ="rojo";
            System.out.println(" su tamaño es pequeño");
            System.out.println(color);
        }
        else{
             if (tamaño <=10){
                color = "morado";
                System.out.println("su tamaño es mediano");
                System.out.println(color);
            }
             else{
                    if (tamaño <=15){
                         color ="azul";
                         System.out.println(" su tamaño es grande");
                         System.out.println(color);
            }
                    else{
                        color ="verde";
                        System.out.println(" su tamaño es demasiado grande");
                         System.out.println(color);
                    }
}
        }
        return color ;
    }
    
    
}
