/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasombreada;

/**
 *
 * @author ADRIANA
 */

import java.util.Scanner;
public class Operacion extends Circunferencia{
    
    public double operacion; 
    public Operacion(){
        operacion=0;
        System.out.println("soy el constructor de operacion");
    }
   
    public double muestra(double acuadrado, double acirculo){
    
    operacion = acuadrado-acirculo;
    System.out.println(" el area sombreada es "+operacion+"cm^2");
    super.Setcolor(super.color(operacion));
   // super.Colores(operacion);
    return operacion;
    }
     public void llamar(){
        Cuadrado c1= new Cuadrado();
        Circunferencia ci2= new Circunferencia();
        muestra( c1.area(), ci2.area());
    }
}
