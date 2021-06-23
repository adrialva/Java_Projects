/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class ISBN {
static int a[]=new int[13];

static int menu(){
    Scanner input = new Scanner (System.in);
    int w;
    System.out.println( "    **Bienvenido al programa de ISBN");
    System.out.println("    1. Saber cual es el codigo de control de su codigo ISBN");
    System.out.println( "   2. Saber si su codigo ISBN es correcto o no");
    w=input.nextInt();
    return w;
}
static void inicio(){
    Scanner input = new Scanner (System.in);
    System.out.println(" Digite los 12 primeros digitos que tiene su codigo");
    for(int i=0; i<12;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		a[i]=input.nextInt();
	}
}
static void segundo(){
    Scanner input = new Scanner (System.in);
    System.out.println("  Digite los 13 digitos que tiene su codigo para la verificacion ");
    for(int i=0; i<13;i++){ //entrar digitos
	System.out.println("  Digito "+i+": ");
	a[i]=input.nextInt();
	}
}
static void verificacion(){
    System.out.println("  Este es el codigo digitado: ");
    for (int i=0; i<=11; i++){
        System.out.println(a[i]+" ");
    }
}
static void verificacion2(){
    System.out.println("  Este es el codigo digitado: ");
    for (int i=0; i<=12; i++){
        System.out.println(a[i]+" ");
    }
}
static int arreglos(){
    
	int j=0;
	int f=0;
	for(int c=0; c<=11;c++){
		if(c%2==0){
			j=a[c]*1;
			f=f+j;
		}
		else{
			j=a[c]*3;
			f=f+j;
		}	
	}
	return f;
}
static void final_1 (int z){
		int y=0;
		int r=0;
		y=z%10;
		r= 10-y;
		System.out.println(" el digito de control: "+ r);	
	}
	static void final_2(int z){
			int y=0;
			int r=0;
			y=z%10;
			r= 10-y;
			if (r==a[12]){
                    System.out.println("  este codigo ISBN es correcto");
			}
			else{
			System.out.println( " este codigo ISBN es incorrecto ");
			}
			
		}
static void opciones(int q){
		if (q==1){
			inicio();
			verificacion();
			arreglos();
			final_1(arreglos());
		}
		if (q==2){
			segundo();
			verificacion2();
			arreglos();
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
