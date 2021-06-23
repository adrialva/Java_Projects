/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Usuario {
    private int ingreso;
    private int ingreso2;
     public Usuario(){
      ingreso=0; //constructor
  }
     public int GetIngreso(){
        return ingreso;
    }
    public void SetIngreso(int ingreso){ //Set
        this.ingreso = ingreso;
    }
     public int ingresoValor(){
    Scanner input = new Scanner (System.in);
    boolean ingresot=false;
    int a=0;
    int b=0;
     System.out.println(" ¿ En que piso se encuentra?");
     ingreso= input.nextInt();
         Proceso ob4 = new Proceso();    
         //ob4.SetRan(ob4.Ran());
     while (a==0){
         
         while(b==0){
              if(ingreso>0){
             
             ob4.Igualacion(ob4.GetRan(), ingreso);
            
            b=1;
         }
         if(ingreso < 0){
            a=1;
            System.out.println("usted a salido del ascensor ");
            b=1;
         }
         }
         System.out.println(" ingrese otro piso ");
         ingreso=input.nextInt();
         if(ingreso>0){
             b=0;
         }
         else{
             a=1;
         }
        
         
     }
    
    return ingreso;
}
}
