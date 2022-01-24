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
public class Menu{
    private int a ;
    private int w;
    Scanner input =new Scanner (System.in);
    Libros ob1 = new Libros();
    Revistas ob2 = new Revistas();
    Periodicos ob3 = new Periodicos();
    
    public Menu(){
        a=0;
        w=0;
        //System.out.println("Soy el constructor de Menu ");
    }
    
    public int Geta(){
        return a;
    }
    public void Seta(int a){
        this.a = a;
    }
    public void MenuExclusivo(){
       int salir=1;
       Libros objeto1 = new Libros(); //puedo mandar los datos directo desde un metodo
       System.out.println( "*** Bienvenido a su libreria exclusiva*** ");
       System.out.println("-Seleccione:");
       System.out.println( " 1. Ingresar Libro nuevo a su libreria  ");
       System.out.println( " 2. Ver sus libros ingresados ");
       System.out.println( " 3. Salir de la libreria exclusiva");
       while(salir!=3){
        try{
            System.out.println("===================================================================================================");
            System.out.println("Elija una opcion");
            salir=input.nextInt();
            input.nextLine();
            if (salir==1){
                System.out.println("Ingresa el titulo");
                String titulo=input.nextLine();
                System.out.println("Ingresa el codigo");
                int codigo =input.nextInt();
                input.nextLine();
                System.out.println("Ingresa el año");
                int año=input.nextInt();
                input.nextLine();
                objeto1.IngresoLibros(titulo,codigo, año);
            }
            if (salir==2){
                objeto1.MostarLibros();
            }
        }
        catch(Exception ex){
           System.out.println(ex.getMessage());
           input.nextLine();
        }
    }
}
    public int MenuLibreria(){
        int w;
       System.out.println( "*** Bienvenido a su libreria ");
       System.out.println(" 1. Ver que libros estan disponibles para prestar ");
       System.out.println(" 2. Crear codigo para su libro o revista  ");
       System.out.println(" 3. Obtener codigo aleatorio para su libro o revista  ");
       System.out.println(" 4. Comprar un producto ");
       
       a = input.nextInt();
       if(a==1){
           ob1.LibrosPrestar(ob1.RCodL(), ob1.APubliL());
       }
       if(a==2){
           ob2.IngresoCrear();
           ob2.Crear(ob2.ProcesoCrear());
       }
       if(a==3){
           ob2.RCodigo();
       }
       if(a==4){
           System.out.println(" Desea comprar: \n 1. un libro \n 2. Una revista \n 3. Un periodico");
           w=input.nextInt();
           input.nextLine();
           if(w==1){
               ob1.venta();
           }
           if(w==2){
               ob2.venta();
           }
           if (w==3){
               ob3.venta();
           }
       }
        return a;
        
    }
    public int MenuGeneral(){
        int g;
        System.out.println(" ☺☺☺ Bienvenido a la libreria ☺☺☺");
        System.out.println(" 1. Ver el menu de libreria normal");
        System.out.println(" 2. Ver el menu de libreria exclusivo ");
        g=input.nextInt();
        input.nextLine();
        if(g==1){
            MenuLibreria();
        }
        if (g==2){
            MenuExclusivo();
        }
        return g;
    }
    
}
