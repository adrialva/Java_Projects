/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.automoviles;

import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class TestAutomoviles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        OperacionesA ob1 = new Carros();
        OperacionesA ob2 = new Camiones();
        Camiones ob4 = new Camiones();
        Carros ob3 = new Carros();
        
        System.out.println("**Bienvenido a Radiador Springs ** ");
        System.out.println(" Seleccione: ");
        System.out.println(" 1. Carro ");
        System.out.println(" 2. Camion ");
        a = input.nextInt();
        input.nextLine();
        if(a ==1){
            ob3.toStringA(ob1.R1(), ob1.pedir());
            ob3.IngPuertas();
        }
        if (a==2){
            ob4.toStringA( ob2.R1(), ob2.pedir());
        }
       // ob4.toStringA(ob2.R1(), ob2.AR1(), ob2.matricula);
        //ob1.pedir();
        //ob2.Aceleracion(ob2.R1());
        //ob1.pedir();
        //ob3.toStringA();
        // TODO code application logic here
    }
    
}
