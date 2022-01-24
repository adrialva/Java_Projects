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
public class Admin extends Empleado{
    Empleado uno;
    public Admin(){
        
    }
    public void Sueldo(){
        uno = new Admin();
        uno.Sueldo();
        System.out.println("soy admin ");
    }
}
