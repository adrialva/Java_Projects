/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjeta;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Tarjeta {
    
static int a[]=new int[16];
    
static int menu(){
    Scanner input = new Scanner (System.in);
    int w;
    System.out.println( "    **Bienvenido al programa de verificacion de tarjeta**");
    System.out.println("    1. Saber cual es el codigo de control de su tarjeta");
    System.out.println( "   2. Saber si su codigo tarjeta es correcto o no");
    w=input.nextInt();
    return w;
}
static void inicio(){
    Scanner input = new Scanner (System.in);
    System.out.println(" Digite los 14 primeros digitos que tiene su codigo");
    for(int i=0; i<14;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		a[i]=input.nextInt();
	}
}
static void segundo(){
    Scanner input = new Scanner (System.in);
    System.out.println("  Digite los 13 digitos que tiene su codigo para la verificacion ");
    for(int i=0; i<16;i++){ //entrar digitos
	System.out.println("  Digito "+i+": ");
	a[i]=input.nextInt();
	}
}
static void verificacion(){
    System.out.println("  Este es el codigo digitado: ");
    for (int i=0; i<=14; i++){
        System.out.println(a[i]+" ");
    }
}
static void verificacion2(){
    System.out.println("  Este es el codigo digitado: ");
    for (int i=0; i<=15; i++){
        System.out.println(a[i]+" ");
    }
}
static int arreglos(){
    Scanner input = new Scanner (System.in);
        int y=0; 
	int j=0;
	int f=0;
        int x=0;
        int d=0;
        
	for(int c=0; c<=11; c++)
		if(c%2==0){
			j=a[c]*2;
                        if (j>=10){
                            y=j%10;
                            d=y+1;
                            f=f+d;
                        }
                        else{
			f=f+j;
                        }
		}
		else{
			j=a[c]*1;
			f=f+j;
		}	
	return f;
}
static void final_1 (int z){
Scanner input = new Scanner (System.in);
int y=0;
int r=0;
y=z%10;
if(y==0){
System.out.println(" el digito de control: "+ a[15]+ "es correcto");	
}
else{
System.out.println(" el digito de control:incorrecto");
}
}
static void final_2(int z){
Scanner input = new Scanner (System.in);
int y=0;
int r=0;
y=r%10;
r= z+a[15];
if (y==0){
System.out.println(" el digito de control "+a[15]+"es correcto");
}	
else{
System.out.println(r+"el digito de control es correcto");
}		
}
static void opciones(int q){
if (q==1){
inicio();
verificacion();
final_1(arreglos());
}
if (q==2){
segundo();
verificacion2();
final_2(arreglos());
}
}
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
opciones(menu());

// TODO code application logic here
    }
}
    
