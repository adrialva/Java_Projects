/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlibreria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Revistas implements InterfaceG{
    Scanner input =new Scanner (System.in);
    private int NCrear ;
    private String Title;
    private int Code;
    private int Year;
    private int a[]=new int[13];
    public String R1 ="J BIOL CHEM";
    public int RR1= 10000;
    public String R2="J NEUROS SCI";
    public int RR2= 8500;
    public String R3="LANCET";
    public int RR3= 5000;
    
    public Revistas(){
        System.out.println("soy el constructor de libros");
    }
    public String GetTitle(){
        return Title;
    }
    public void SetTitle(String Title){
        this.Title=Title;
    }
    public int GetCode(){
        return Code;
    }
    public void SetCode(int Code){
        this.Code=Code;
    }
    public int GetYear(){
        return Year;
    }
    public void SetYear(int Year){
        this.Year= Year;
    }
    
    public int GetNCrear (){
        return NCrear;
    }
    public void SetNCrear(int NCrear){
        this.NCrear=NCrear;
    }
    public void IngresoCrear(){
        Scanner input = new Scanner (System.in);
    System.out.println(" Digite los 12 primeros digitos que quiere que tenga su codigo ");
    for(int i=0; i<12;i++){ //entrar digitos
        System.out.println("  Digito "
                +i
                +": ");
		a[i]=input.nextInt();
	}
    }
    public int ProcesoCrear(){
        
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
     public void Crear (int f){  //String 
		int y=0;
		int r=0;
		y= f %10;
		r= 10-y;
		System.out.println(" el digito de control es: "+ r);
    }
    public void MTodos(int f){
        IngresoCrear();
        ProcesoCrear();
        Crear(f);
    }
    public int APublicacion(){
        Random año = new Random();
        Year=  1663 + año.nextInt(358);
        System.out.println("el año de publicacion es: "+Year);
        return Year;
    }
    public int RCodigo(){
        Random codigoR = new Random();
        Code =  99999 + codigoR.nextInt(900000);
        System.out.println("el codigo de su libro es: "+ Code);
        return Code;
    }
    @Override
    public void aprestar(int prestadoL){
    }
    @Override
    public void devuelto(int prestadoL){
    }
    @Override
    public void enprestamo(int prestadoL){
    }
    @Override
    public void venta(){
        int V;
        int L;
        int D;
        int dif;
        
        int dif2;
        System.out.println("Los periodicos que se encuentran en venta son:");
        System.out.println(R1+"\n"+R2+"\n"+R3);
         System.out.println(" Desea Comprar alguno de estos periodicos ?");
        System.out.println(" 1. Si \n 2. No");
        V=input.nextInt();
        if(V==1){
            System.out.println(" cual desea llevar?");
                    System.out.println(" 1. "+R1 +" \n 2. "+R2+" \n 2. "+R3);
                    L=input.nextInt();
                    if(L==1){
                        System.out.println("la revista que va a compar es:"+R1+"\n Y su Precio es: "+RR1+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==RR1){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<RR1){
                            dif=RR1-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if(L==2){
                        System.out.println("la revista que va a compar es:"+R2+"\n Y su Precio es: "+RR2+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==RR2){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<RR2){
                            dif=RR2-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if (L==3){
                        System.out.println("la revista que va a compar es:"+R3+"\n Y su Precio es: "+RR3+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==RR3){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<RR3){
                            dif=RR3-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
        }
    }
}
