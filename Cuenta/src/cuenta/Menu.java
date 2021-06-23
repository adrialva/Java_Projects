

package cuenta;

import java.util.Scanner;

public class Menu {
    public static void main (String [] argss){
          Scanner input = new Scanner(System.in);
        int a;
        int b;
        int o;
        Persona obj1 = new Persona();
        Cuenta obj2 = new Cuenta();
        System.out.println(" ** Bienvenido al Banco AAA **");
        a=obj1.MayorDeEdad();
        if (a>=18){
        obj1.mostrar();
        System.out.println(" La Edad del cliente: "+a);
        System.out.println(" Si usted es el titular de la cuenta digite 1");
        t= input.nextInt();
        if (t==1){
        System.out.println(" si desea ver el estado de su cuenta digite 1");
        System.out.println(" si desea ingresar dinero a su cuenta digite 2");
        System.out.println(" si desea retirar dinero a su cuenta digite 3");
        o= input.nextInt();
        if (o==1){
            b=obj2.mostrar();
        }
        
        if (o==2){
            b=obj2.mostrar();
        obj2.ingresar(b);
        }
        if (o==3){    
            b=obj2.mostrar();
        obj2.retirar(b);    
        }
        }
        else{
            System.out.println(" Solo el titular puede manejar su cuenta, gracias.");
        }
        }
        
    }
    
}