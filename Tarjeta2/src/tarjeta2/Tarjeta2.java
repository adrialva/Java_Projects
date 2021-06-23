/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjeta2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Tarjeta2 {
    private BigInteger b;
private BigInteger a[] = new BigInteger[16];
private BigInteger biMod = new BigInteger ("10");
 private BigInteger biM = new BigInteger ("2");
private BigInteger biS = new BigInteger ("1");
private BigInteger ff= new BigInteger ("0");
private BigInteger visa= new BigInteger ("4");
private BigInteger Mcard= new BigInteger ("5");
private BigInteger Discover= new BigInteger ("6");
private BigInteger DAmex_1= new BigInteger ("3");
private BigInteger DAmex_2= new BigInteger ("4");

public Tarjeta2(){
    b = new BigInteger("0");
    for (int i=0; i<16;i++){
        a[i]= new BigInteger ("0");
    }
}
public void Seta (BigInteger c1){
    b=c1;
}
public BigInteger Geta(){
    return b;
}
public void entrar1(){
Scanner input = new Scanner (System.in);
    System.out.println(" Digite los 15 primeros digitos que tiene su codigo");
    for(int i=0; i<15;i++){ //entrar digitos
        System.out.println("  Digito " +i
                +": ");
		a[i]=input.nextBigInteger();
	}
}
 public void saber(){
     int g;
     int h;
     int u;
     int w;
     int w2;
     int w3;
     w2 = a[1].compareTo(visa);
     g = a[0].compareTo(visa);
     h = a[0].compareTo(Mcard);
     u= a[0].compareTo(Discover);
     w= a[0].compareTo(DAmex_1);
     w3= a[0].compareTo(DAmex_2);
     if (g==0){
         System.out.println(" Su tarjeta es Visa");
     }
     if(h==0){
         System.out.println(" Su tarjeta es Mastercard ");
     }
     if(u==0){
         System.out.println(" Su tarjeta es Discover ");
     }
     if(w3==0){
         if(w2==0){
         System.out.println(" Su tarjeta es AmericanExpress ");
     }    
     }
     if(w==0){
         System.out.println(" Su tarjeta es Dinners Club");
     }
             
 } 
public void entrar2(){
Scanner input = new Scanner (System.in);
    System.out.println(" Digite los 13 primeros digitos que tiene su codigo");
    for(int i=0; i<16;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		a[i]=input.nextBigInteger();
	}
}
public BigInteger arreglos(){
    Scanner input = new Scanner (System.in);
        int y=0; 
	int j=0;
	int f=0;
        int x=0;
        int d=0;
        
	for(int c=0; c<=11; c++)
		if(c%2==0){
			BigInteger multi = a[c].multiply(biM);//j
                         x= multi.compareTo(biMod);
                        if (x>=0){
                            BigInteger mod =multi.mod(biMod);
                            BigInteger suma = mod.add(biS);
                            ff = ff.add(suma);
                        }
                        else{
			ff = ff.add(multi);
                        }
		}
		else{
			BigInteger multi= a[c].multiply(biS);//j
			ff= ff.add(multi);
		}	
	return ff;
}
public void final_1 (BigInteger z){
Scanner input = new Scanner (System.in);
BigInteger y = new BigInteger ("0");
BigInteger r = new BigInteger ("0");
y=z.mod(biMod);
r = biMod.subtract(y);
System.out.println(" el digito de control: "+ r);	
}
 public void final_2(BigInteger z){
Scanner input = new Scanner (System.in);
BigInteger y = new BigInteger ("0");
BigInteger w = new BigInteger ("0");
int r=0;
y=z.mod(biMod);
w= z.add(a[15]);
r = y.compareTo(ff);
if (r==0){
System.out.println(" el digito de control "+a[15]+"es correcto");
}	
else{
System.out.println("el digito de control es correcto");
}		
}

}
