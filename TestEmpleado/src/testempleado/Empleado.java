/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testempleado;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Empleado {
    Empleado uno;
    Scanner input = new Scanner (System.in);
    int s;
    public Empleado(){
        
    }
    public void Sueldo(){
        System.out.println("Ingrese cual es su sueldo actualmente");
        s=input.nextInt();
    }
}
