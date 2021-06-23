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
public class Circunferencia implements IFigura{
    public double acirculo;
    private double radio;
    private double tamaño; 
    private String color; 
    
    public Circunferencia(){
        acirculo=0;
        radio=0;
        tamaño =0;
        color = "blanco";
        System.out.println("soy el constructor de circunferencia2"
                + "");
    }
    public Circunferencia(String c, double t){
        this.color=c;
        this.tamaño=t;
        acirculo=0;
        radio=0;
    }
    public double devuelve_r(){ //get
        return radio;
    }
    public String Getcolor(){
        return color;
    }
    public void Setradio(double radio){ //Set
        this.radio=radio;
    }
    public void Setcolor(String color){
        this.color=color;
    }
    public double pedir(){
    Scanner input = new Scanner (System.in);
    System.out.println(" ingrese el radio del circulo");
    radio = input.nextDouble();   
     return radio;
    }
    @Override
    public double area(){
    this.Setradio(this.pedir());
    acirculo = Math.PI*radio* radio;
    System.out.println("el area del circulo es:"+ acirculo);
    return acirculo;
    }
    public double Tamaño1 (double acirculo){
        tamaño=acirculo+3;
        return tamaño; 
    }
    @Override
    public String color(double tamaño){
        if (tamaño <=15){
            color ="rojo";
            System.out.println(" su tamaño es pequeño");
            System.out.println(color);
        }
        else{
             if (tamaño <=25){
                color = "morado";
                System.out.println("su tamaño es mediano");
                System.out.println(color);
            }
             else{
                    if (tamaño <=35){
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

