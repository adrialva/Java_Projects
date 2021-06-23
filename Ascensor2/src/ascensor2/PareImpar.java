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
public class PareImpar extends Pelao{
    private int a=0;
    private int par=0;
    private int par2=0;
    private int c=0;
    int b=0;
    Proceso2 p2 = new Proceso2();
    Continuo ob1 = new Continuo();
    public int pares(){
        int c=0;
        a=super.Ingreso();
        c= p2.IngresoE2();
        par = a%2;
        par2= b%2;
        int d=0;
        while(d==0){
            if (a<0){
          System.out.println("usted a salido del ascensor ");
          d=1;
       }
            else{
        if(a<=7){
            if(par==0){
                p2.Movimiento2(c);
               //if (par2==0){
                 //  p2.Movimiento2();
               //}
            }
        }
        }
        }
        return a;
    }
    public int Impares(){
        int s;
        s = p2.IngresoE2();
        Elevator obj3 = new Elevator();
        a=super.Ingreso();
        par = a%2;
        if(a<=7){
            if(par!=0){
                p2.Movimiento2Impares(s);
                
            }
            
    }
        return a;
    }
    public int Menu(){
        
        System.out.println("***Bienvenido al ascensor ***");
        System.out.println("1. Ascensor normal");
        System.out.println("2. Ascensor de solo numeros pares");
        System.out.println("3. Ascensor de solo numeros impares");
        c=input.nextInt();
        if (c==1){
            ob1.Move2();
        }
        if (c==2){
            pares();
        }
        if (c==3){
            Impares();
        }
        return c; 
    }
    
}
