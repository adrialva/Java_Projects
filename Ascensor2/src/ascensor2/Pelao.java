/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor2;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Pelao {
   private int p=0;
   private int m=0;
   Scanner input = new Scanner (System.in);
   public int GetP(){ //get
        return p;
    }
    public void SetP(int p){
        this.p=p;
    }
    public int GetM(){ //get
        return m;
    }
    public void SetM(int m){
        this.m=m;
    }
    public int Ingreso(){    
        System.out.println("ingrese el piso en que se encuentra");
        p=input.nextInt();
        return p;
    }
   public int Movimiento(){
       System.out.println(" a donde se va a mover ");
       m=input.nextInt();
       return m;
   }
}
