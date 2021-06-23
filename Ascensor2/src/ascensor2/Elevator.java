/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Elevator extends Pelao {
    private int e=0;
    private int me=0;
   public int GetE(){ //get
        return e;
    }
    public void SetE(int e){
        this.e=e;
    }
    public int GetMe(){ //get
        return me;
    }
    public void SetMe(int me){
        this.me=me;
    }
    public int IngresoE(){    
        Random piso = new Random();
        int d= -3 + piso.nextInt(11);
        System.out.println("el ascensor: "+d);
        return d;
    }
   public int MovimientoE(int d){
       int w=0;
       int q=0;
       while(q==0){
       me=super.Movimiento();
       if (me>0){
           w=0;
       }
       else{
           q=1;
       }
       while(w==0){
       if (me<0){
          System.out.println("usted a salido del ascensor ");
          w=1;
       }
       else{
            if(me>7){
              while(me>7){
                  System.out.println("Ingrese nuevamente su posicion");
                  me=input.nextInt();
              }
               if(me<d){
                 for(int i=d; i>=me;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                d=i;
                w=1;
             }     
         }
               else{
             if(me > d){
                 for(int e=d; e<=me; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     d=e;
                     w=1;
                 }
             }
             else{    
             }
               }
          }
            else{
                if(me<d){
                 for(int i=d; i>=me;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                 d=i;
                 w=1;
             }
         }
                else{
                  if(me > d){
                 for(int e=d; e<=me; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     d=e;
                     w=1;
                 }
             } 
                }
       }
            }
       }
       }
         return d;
   }
    
}
