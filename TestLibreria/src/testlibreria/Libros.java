/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlibreria;

import java.io.*;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Libros implements InterfaceG {
    Scanner input =new Scanner (System.in);
    private int a;
    private String tituloL;
    private int codigoL;
    private int añoL;
    private int Prestado;
    private String L1=" El principito";
    private int LR1 = 80000;
    private String L2=" El Codigo Da Vinci";
    private int LR2 = 100000;
    private String L3=" El alquimista";
    private int LR3 = 60000;
    private String L4=" Cien años de soledad";
    private int LR4 = 95000;
    File Libros = new File( "Libros.txt");
    
    public Libros(){
        int a=0;
        String tituloL ="a";
        int codigoL=0;
        int añoL=0;
        int Prestado=0;
        //System.out.println("soy el constructor de libros");
    }
    public int Geta(){
        return a;
    }
    public void Seta(int a){
        this.a=a;
    }
    public String GettituloL(){
        return tituloL;
    }
    public void SettituloL(String tituloL){
        this.tituloL=tituloL;
    }
    public int GetcodigoL(){
        return codigoL;
    }
    public void SetcodigoL(int codigoL){
        this.codigoL=codigoL;
    }
    public int GetañoL(){
        return añoL;
    }
    public void SetañoL(int añoL){
        this.añoL=añoL;
    }
    public int GetPrestado(){
        return Prestado;
    }
    public void SetPrestado (int Prestado){
        this.Prestado = Prestado;
    }
    public int APubliL(){
        Random año = new Random();
        añoL=  1800 + año.nextInt(221);
        //System.out.println("el año de publicacion es: "+añoL);
        return añoL;
    }
    public int RCodL(){
        Random codigo = new Random();
        codigoL=  999 + codigo.nextInt(9000);
        //System.out.println("el codigo de su libro es: "+ codigoL);
        return codigoL;
    }
    public int SaberPrestado(){
         Random prestado = new Random();
        Prestado= 1+ prestado.nextInt(4);
        //System.out.println("el libro esta: "+ Prestado);
        return Prestado;
    }
    @Override
    public void aprestar(int prestadoL){
        
        if (prestadoL == 1){
            System.out.println("El libro esta habilitado para prestar");
        }
    }
    @Override
    public void devuelto(int prestadoL){
        if(prestadoL ==2 ){
            System.out.println(" El libro ha sido devuelto hace unos dias");
        }
    }
    @Override
    public void enprestamo(int prestadoL){
        if (prestadoL ==3){
            System.out.println(" El libro ha sido prestado ");
        }
        
    }
    public int Todos(int prestadoL){
    aprestar(prestadoL);
    devuelto(prestadoL);
    enprestamo(prestadoL);
    return prestadoL;
}
    @Override
    public void venta(){
        int v;
        int l;
        int D;
        int dif;
        int dif2;
        System.out.println("Los libros que se encuentran en venta son:");
        System.out.println(L1+"\n"+L2+"\n"+L3+"\n"+L4);
         System.out.println(" Desea Comprar alguno de esos libros?");
        System.out.println(" 1. Si \n 2. No");
        v=input.nextInt();
        if(v==1){
            System.out.println(" cual desea llevar?");
            System.out.println("1. "+L1+"\n 2. "+L2+"\n 3. "+L3+"\n 4. "+L4);
                    l=input.nextInt();
                    if(l==1){
                        System.out.println("la revista que va a compar es:"+L1+"\n Y su Precio es: "+LR1+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==LR1){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<LR1){
                            dif=LR1-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if(l==2){
                        System.out.println("la revista que va a compar es:"+L2+"\n Y su Precio es: "+LR2+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==LR2){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<LR2){
                            dif=LR2-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if (l==3){
                        System.out.println("la revista que va a compar es:"+L3+"\n Y su Precio es: "+LR3+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==LR3){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<LR3){
                            dif=LR3-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
                    if(l==4){
                        System.out.println("la revista que va a compar es:"+L4+"\n Y su Precio es: "+LR4+" pesos");
                        System.out.println(" ingrese su dinero");
                        D=input.nextInt();
                        if(D==LR4){
                            System.out.println("Gracias por su compra");
                        }
                        if(D<LR4){
                            dif=LR4-D;
                            System.out.println("Faltan "+dif+" pesos\n Por favor ingrese el dinero que falta");
                            dif2=input.nextInt();
                            if(dif2==dif){
                                System.out.println("Gracias por su compra");
                            }
                        }
                    }
        }
    }
    public String AString (String tituloL, int codigoL, int añoL){
        String codigo = Integer.toString(codigoL);
        String año = Integer.toString(añoL);
        String todos;
        todos = codigo+año;
        System.out.println("año y codigo " + codigo +" "+ año);
        return todos;
    }
    public void LibrosPrestar(int codigoL,int añoL){
        int w;
        int p;
        int l;
        System.out.println(" Estos son los libros que se encuentran en biblioteca: ");
        System.out.println(L1+"\n"+L2+"\n"+L3+"\n"+L4);
        System.out.println(" Desea saber cual esta habilitado para prestar?");
        System.out.println(" 1. Si \n 2. No");
        w=input.nextInt();
        if(w==1){
            Random PLib = new Random();
            String primero = L1+"\n"+L2;
            String segundo = L2+ "\n"+L3;
            String tercero = L3+ "\n"+L4;
            String cuarto = L4+ "\n"+L1;
            a= PLib.nextInt(6);
            System.out.println("el libro esta: "+ a);
            if(a==0){
                System.out.println("los libros habilitados son:");
                System.out.println(primero);
                System.out.println("Quiere llevar alguno en prestamo?");
                System.out.println(" 1. Si \n 2. No");
                p=input.nextInt();
                if(p==1){
                    System.out.println(" cual desea llevar?");
                    System.out.println(" 1. "+L1 +" \n 2. "+L2);
                    l=input.nextInt();
                    if(l==1){
                        System.out.println("su libro en prestamo es:"+L1+"\n Su codigo es: "+codigoL);
                    }
                    if(l==2){
                        System.out.println("su libro en prestamo es:"+L2+"\n Su codigo es: "+codigoL);
                    }
                }
                
            }
            else{
                if(a==1){
                    System.out.println("los libros habilitados son:");
                    System.out.println(segundo);
                    System.out.println("Quiere llevar alguno en prestamo?");
                    System.out.println(" 1. Si \n 2. No");
                    p=input.nextInt();
                    if(p==1){
                        System.out.println(" cual desea llevar?");
                        System.out.println(" 1. "+L2 +" \n 2. "+L3);
                        l=input.nextInt();
                        if(l==1){
                            System.out.println("su libro en prestamo es:"+L2+"\n Su codigo es: "+codigoL);
                        }
                        if(l==2){
                        System.out.println("su libro en prestamo es:"+L3+"\n Su codigo es: "+codigoL);
                        }
                    }
                }
                else{
                    if(a==2){
                        System.out.println("los libros habilitados son:");
                        System.out.println(tercero);
                        System.out.println("Quiere llevar alguno en prestamo?");
                        System.out.println(" 1. Si \n 2. No");
                        p=input.nextInt();
                        if(p==1){
                            System.out.println(" cual desea llevar?");
                            System.out.println(" 1. "+L3 +" \n 2. "+L4);
                            l=input.nextInt();
                            if(l==1){
                                System.out.println("su libro en prestamo es:"+L3+"\n Su codigo es: "+codigoL);
                            }
                            if(l==2){
                            System.out.println("su libro en prestamo es:"+L4+"\n Su codigo es: "+codigoL);
                            }
                        }
                    }
                    else{
                        if(a==3){
                            System.out.println("los libros habilitados son:");
                            System.out.println(cuarto);
                            System.out.println("Quiere llevar alguno en prestamo?");
                            System.out.println(" 1. Si \n 2. No");
                            p=input.nextInt();
                            if(p==1){
                                System.out.println(" cual desea llevar?");
                                System.out.println(" 1. "+L4 +" \n 2. "+L1);
                                l=input.nextInt();
                                if(l==1){
                                    System.out.println("su libro en prestamo es:"+L4+"\n Su codigo es: "+codigoL);
                                }
                                if(l==2){
                                    System.out.println("su libro en prestamo es:"+L1+"\n Su codigo es: "+codigoL);
                                }
                                else{
                                System.out.println(" no hay ningun libro para prestar");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //ARCHIVO
    public void CrearLibro(){
        try{
            if (Libros.exists()){
                 System.out.println("El archivo ya existe");
            }
        }
        catch(Exception ex){
             System.out.println(ex.getMessage());
        }
    }
    public void IngresoLibros(String tituloL, int codigoL, int añoL){
        try{
        BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Libros, true)));
        Fescribe.write(tituloL+"   "+codigoL+"    "+ añoL);
        Fescribe.write("\n");
        Fescribe.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void MostarLibros(){
        try{
            FileReader FR= new FileReader("Libros.txt");
            BufferedReader BR = new BufferedReader(FR);
            String cadena;
            while((cadena=BR.readLine())!=null){
                System.out.println(" "+cadena);
                
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
