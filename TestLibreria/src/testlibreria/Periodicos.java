/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlibreria;

import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Periodicos implements InterfaceG{
    Scanner input =new Scanner (System.in);
    public String P1 ="The Washington Post";
    public int PR1= 5000;
    public String P2="Al minuto";
    public int PR2= 1500;
    public String P3="El Espectador";
    public int PR3= 2000;
    
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
        System.out.println(P1+"\n"+P2+"\n"+P3);
         System.out.println(" Desea Comprar alguno de estos periodicos ?");
        System.out.println(" 1. Si \n 2. No");
        V=input.nextInt();
        if(V==1){
            System.out.println(" cual desea llevar?");
                    System.out.println(" 1. "+P1 +" \n 2. "+P2+" \n 2. "+P3);
                    L=input.nextInt();
                    if(L==1){
                        System.out.println("la revista que va a compar es:"+P1+"\n Y su Precio es: "+PR1+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==PR1){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<PR1){
                            dif=PR1-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if(L==2){
                        System.out.println("la revista que va a compar es:"+P2+"\n Y su Precio es: "+PR2+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==PR2){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<PR2){
                            dif=PR2-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if (L==3){
                        System.out.println("la revista que va a compar es:"+P3+"\n Y su Precio es: "+PR3+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==PR3){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<PR3){
                            dif=PR3-D;
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
