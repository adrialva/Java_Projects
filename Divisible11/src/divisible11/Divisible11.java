/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible11;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Divisible11 {
    int b;
private BigInteger a= new BigInteger("0");
private BigInteger c= new BigInteger("10");
BigInteger mod11 = new BigInteger("11");

public void Ingreso(){
    Scanner input = new Scanner (System.in);
    System.out.println(" digite su numero ");
		a=input.nextBigInteger();
}
public void verificacion(){
    System.out.println("  Este es el codigo digitado: ");
        System.out.println(a);
}
    public BigInteger revision(){
        int y;
        int u;
        int q;
        int w;
        BigInteger mod = new BigInteger("0");
        BigInteger Divi = new BigInteger("0");
        BigInteger resta= new BigInteger("0");
        BigInteger x = new BigInteger("0");
        int L;
        L=a.toString().length();
        y =a.compareTo(c);
        if (y==1){ // 1==>
            for (int h=0; h<L-2;h++){
            mod = a.mod(c);
            x = mod.negate();
            a = a.divide(c);
            resta = a.add(x);
            System.out.println(resta);
            }     
        }
        return resta;         
    }
    public BigInteger m( BigInteger resta){
     BigInteger m = new BigInteger("0");
     int s;
     m = resta.mod(mod11);
     s= resta.compareTo(m);
     if (s==1){
     System.out.println(m);
    }
     return m;
}
}
