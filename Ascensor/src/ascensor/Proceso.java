/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Proceso extends Usuario {
    Usuario obj3;
    private int a ;
    int b;
    int c;
    private int r;
    int piso;
    Random ascensor = new Random();
      private int ingreso;
    private int ingreso2;
   
    public int GetRan(){
        return piso;
    }
    public void SetRan(int piso){ //Set
        this.piso=piso;
    }
     public int Ran(){
         piso= -3 + ascensor.nextInt(11);
         System.out.println(piso);
         return piso;
     }
     public int Igualacion(int piso, int ingreso ){
         //if (ingreso != piso){
             if(ingreso<piso){
                 for(int i=piso; i>=ingreso;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                 piso=i;
             }
         }
             if(ingreso > piso){
                 for(int e=piso; e<=ingreso; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     piso=e;
                 }
             }
         
         if(ingreso==piso){
             System.out.println(" El ascensor esta es su mismo piso");
             
         }
         return piso;
}
}
