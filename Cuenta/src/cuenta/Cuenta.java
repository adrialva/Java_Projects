/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Cuenta {
 private String titular; //persona
 private int cantidad;
 public Cuenta(){
     titular="a";
     cantidad=0;
 }
 public String Gett(){
        return titular;
    }
public void Sett( String tt){
    titular=tt;
}
    
 public int Getc(){
        return cantidad;
    }
public void Setc( int cntd){
    cantidad=cntd;
}

public int mostrar(){//muestra datos de cuenta 
    int r;
    int n;
    Random aleatorio= new Random();
    n=aleatorio.nextInt(9999)+0;
    cantidad =aleatorio.nextInt(100000000)-3;
    System.out.println(" su codigo de cuenta es: " +n);
    if (cantidad<=0){
        System.out.println("usted no tiene saldo");
    }
    else{
    System.out.println(" Su saldo es: "+cantidad);
    }
    return cantidad;
}
public double ingresar(int cantidad){
    int m;
    int suma;
    Scanner input = new Scanner(System.in);
    System.out.println(" Digite el monto que desea ingresar a su cuenta ");
    m = input.nextInt();
    if (m<=0){
    System.out.println(" el monto ingresado es invalido");
    }
    else{
        System.out.println(" el monto ingresado es: "+m );
        suma= cantidad+m; 
        System.out.println(" el valor nuevo de su cuenta es: "+suma );
    }

//si es negativo no hace nada
return cantidad;
}
public double retirar(int cantidad){
    //se retira una cantidad de la cuenta 
    int rt;
    int diferencia;
    Scanner input = new Scanner(System.in);
    System.out.println(" Digite el monto que desea retirar de su cuenta ");
    rt = input.nextInt();
    if (rt<=0){
    System.out.println(" el monto ingresado es invalido");
    }
    else{
        System.out.println(" el monto ingresado es: "+rt );
        diferencia = cantidad-rt; 
        if (diferencia<0){
        System.out.println(" el valor nuevo de su cuenta es: "+diferencia );
        }
    }
        

    return cantidad;
}

}
