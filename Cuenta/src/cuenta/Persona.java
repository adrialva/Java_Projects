/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author ADRIANA
 */
public class Persona {

private String nombre;
private int edad;
private String DNI;

public Persona(){ //constructor
    nombre= "a";
    edad=0;
    DNI="a";
}
public void Setn( String n){
    nombre= n;
}
    public String Getn(){
        return nombre;
    }
public void Sete( int e){
    edad= e;
}
public int Gete(){
        return edad;
    }
public void SetDNI( String CC){
    DNI=CC;
}
    
    public String GetDNI(){
        return DNI;
    }
    
    public int mostrar(){ //muestra datos de la persona
        
        Ingreso nmbre= new Ingreso();
        nmbre.SetNP(nmbre.PedirNp());
        Ingreso Dc = new Ingreso();
        Dc.SetpDNI(Dc.PedirDNI());
        
        nombre = nmbre.GetNP();
        DNI= Dc.GetpDNI();
        
        System.out.println(" Nombre del cliente:  " +nombre);
        System.out.println(" DNI del cliente:  " +DNI);
        
        return edad;
    }
    public int MayorDeEdad(){ //indicar si es mayor de edad, retornar valor 
   
        Ingreso EDM = new Ingreso();
        EDM.SetED(EDM.PedirED());
        edad= EDM.GetED();
        if (edad<18){
         System.out.println(" usted no es apto para la cuenta, usted es menor de edad");
        }
        return edad;
    }
            
}
