/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.automoviles;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public abstract class OperacionesA {
    Scanner input = new Scanner(System.in);
    String matricula;
     int velocidadR;
     int aceleracionR;
    
    public String pedir(){
        System.out.println(" Ingrese la matricula");
        matricula=input.nextLine();
        return matricula;
    }
    public int R1(){
        Random velocidad = new Random();
        velocidadR=  0 + velocidad.nextInt(350);
        return velocidadR;
    }
    public abstract void toStringA(int velocidadR, String matricula );
}
