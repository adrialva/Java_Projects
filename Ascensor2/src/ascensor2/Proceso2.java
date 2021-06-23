/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor2;

/**
 *
 * @author ADRIANA
 */
public class Proceso2 extends Pelao{
    private int m;
    private int p;
    public int Ingreso2(){    
        System.out.println("ingrese el piso en que se encuentra");
        p=input.nextInt();
        return p;
    }
    public int IngresoE2(){  
        int a;
        Elevator me = new Elevator();
        a=me.IngresoE();
        return a;
    }
   public int Movimiento2(int a){
       System.out.println(" a donde se va a mover ");
       m=input.nextInt();
       int x;
       int w=0;
       int q =0;
       int me;
        x=m%2;
       while(x!=0){
       if(x !=0){
       System.out.println(" ese piso es invalido, ingrese nuevamente el piso ");
       System.out.println(" a donde se va a mover ");
       System.out.println(x);
       m=input.nextInt();
       x=m%2;
       }
       }
       while(q==0){
       if (x==0){
           w=0;
       }
       else{
           q=1;
       }
       while(w==0){
       if (m<0){
          System.out.println("usted a salido del ascensor ");
          w=1;
       }
       else{
            if(x>7){
              while(x>7){
                  System.out.println("Ingrese nuevamente su posicion");
                  m=input.nextInt();
              }
               if(x<a){
                 for(int i=a; i>=x;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                a=i;
                w=1;
             }     
         }
               else{
             if(x > a){
                 for(int e=a; e<=x; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     a=e;
                     w=1;
                 }
             }
             
               }
          }
            else{
                if(x<a){
                 for(int i=a; i>=x;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                 a=i;
                 w=1;
             }
         }
                else{
                  if(x > a){
                 for(int e=a; e<=x; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     a=e;
                     w=1;
                 }
             } 
                }
       }
            }
       }
       x=m%2;
       }
       return x;
}
    public int Movimiento2Impares(int a){
       System.out.println(" a donde se va a mover ");
       m=input.nextInt();
       int x;
       int w=0;
       int q =0;
       int me;
        x=m%2;
       while(x==0){
       if(x ==0){
       System.out.println(" ese piso es invalido, ingrese nuevamente el piso ");
       System.out.println(" a donde se va a mover ");
       System.out.println(x);
       m=input.nextInt();
       x=m%2;
       }
       }
       while(q==0){
       if (x!=0){
           w=0;
       }
       else{
           q=1;
       }
       while(w==0){
       if (m<0){
          System.out.println("usted a salido del ascensor ");
          w=1;
       }
       else{
            if(x>7){
              while(x>7){
                  System.out.println("Ingrese nuevamente su posicion");
                  m=input.nextInt();
              }
               if(x<a){
                 for(int i=a; i>=x;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                a=i;
                w=1;
             }     
         }
               else{
             if(x > a){
                 for(int e=a; e<=x; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     a=e;
                     w=1;
                 }
             }
             
               }
          }
            else{
                if(x<a){
                 for(int i=a; i>=x;i--){
                 System.out.println("el ascensor esta en el piso " + i);
                 a=i;
                 w=1;
             }
         }
                else{
                  if(x > a){
                 for(int e=a; e<=x; e++){
                     System.out.println("el ascensor esta en el piso " +e);
                     a=e;
                     w=1;
                 }
             } 
                }
       }
            }
       }
       x=m%2;
       }
       return x;
}
}
   
