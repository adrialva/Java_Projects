/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballos;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
/*public class Caballos {
    Scanner input = new Scanner (System.in);
 String nombre[]= new String [5];
 String aux;
 String puntuacion;
 String puesto; 
    
 public void leerNombre(){
     Scanner entrada = new Scanner (System.in);
     for(int i=0; i<nombre.length;i++){ //entrar digitos
        System.out.println("  escriba el nombre del caballo");
	aux=entrada.nextLine();
        nombre[i]=aux;
     }
     
     for(int i=0; i<nombre.length;i++){
         System.out.println(" posicion del arreglo "+i +":"+nombre [i]);
     }
     
 }
*/
public class Caballos {
    Scanner input = new Scanner (System.in);
 String nombre[]= new String [5];
 String c1="Zeus";
 String c2="Malkova";
 String c3="Orion"; 
 String c4="Maximus";
 String c5="Tiro al Blanco";
 
 int ap= 90;
 int as=70;
 int at=50;
 public void leerNombre(){
     System.out.println( "***Bienvenido a las competencias de caballos");
     System.out.println( "  El caballo 1 se llama: "+c1);
     System.out.println( "  El caballo 2 se llama: "+c2);
     System.out.println( "  El caballo 3 se llama: "+c3);
     System.out.println( "  El caballo 4 se llama: "+c4);
     System.out.println( "  El caballo 5 se llama: "+c5);
 }
 public void menuapuestas(){
    Scanner input = new Scanner (System.in);
     int w;
     System.out.println("** Apuestas**");
     System.out.println("   Primer puesto: "+ap+"dolares");
     System.out.println("   segundo puesto: "+as+"dolares");
     System.out.println("   tercer puesto: "+at+"dolares");
     System.out.println("   ¿Cuanto desea apostar?");
     w= input.nextInt();
 }
 public void Proceso(){
     int puntaje[]= new int[5];
     Random aleatorio= new Random();
     
     for (int x=0; x<5; x++){
     puntaje [x]=aleatorio.nextInt(10);
     System.out.println("el puntaje del caballo es " +puntaje[x]);
     }
     if (puntaje[0]>puntaje[1]){
         if (puntaje[0]>puntaje[2]){
             if (puntaje[0]>puntaje[3]){
                 if (puntaje[0]>puntaje[4]){
                     System.out.println(" El caballo ganador es"+c1+" con un puntaje de :"+ puntaje[0]);
                     System.out.println(" Usted ha ganado la apuesta de primer puesto por un valor de: "+ap+"dolares");
                 }
             }
         }
     }
     if (puntaje[1]>puntaje[0]){
         if (puntaje[1]>puntaje[2]){
             if (puntaje[1]>puntaje[3]){
                 if (puntaje[1]>puntaje[4]){
                     System.out.println(" El caballo ganador es "+c2+"con un puntaje de :"+ puntaje[1]);
                     System.out.println(" Usted ha ganado la apuesta de primer puesto por un valor de: "+ap+"dolares");
                 }
             }
         }
     }
     if (puntaje[2]>puntaje[0]){
         if (puntaje[2]>puntaje[1]){
             if (puntaje[2]>puntaje[3]){
                 if (puntaje[2]>puntaje[4]){
                     System.out.println(" El caballo ganador es "+c3+"con un puntaje de :"+ puntaje[2]);
                     System.out.println(" Usted ha ganado la apuesta de primer puesto por un valor de: "+ap+"dolares");      
                 }
             }
         }
     }
     if (puntaje[3]>puntaje[0]){
         if (puntaje[3]>puntaje[1]){
             if (puntaje[3]>puntaje[2]){
                 if (puntaje[3]>puntaje[4]){
                     System.out.println(" El caballo ganador es "+c4+"con un puntaje de :"+ puntaje[3]);
                     System.out.println(" Usted ha ganado la apuesta de primer puesto por un valor de: "+ap+"dolares");
                 
                 }
             }
         }
     }
    if (puntaje[3]>puntaje[0]){
         if (puntaje[3]>puntaje[1]){
             if (puntaje[3]>puntaje[2]){
                 if (puntaje[3]>puntaje[4]){
                     System.out.println(" El caballo ganador es "+c5+" con un puntaje de :"+ puntaje[4]);
                     System.out.println(" Usted ha ganado la apuesta de primer puesto por un valor de: "+ap+"dolares");
                 }
             }
         }
     }
     if (puntaje[4]== puntaje[0]){
         System.out.println(" Los caballos "+c1+" y"+ c5+" quedaron empatados y su puntaje es: "+ puntaje[4]);
         if (puntaje[4]==puntaje[1]){
         System.out.println(" Los caballos "+c2+"y "+c5+" quedaron empatados y su puntaje es: "+ puntaje[4]);
             if (puntaje[4]==puntaje[2]){
         System.out.println(" Los caballos "+c3+" y"+ c5+" quedaron empatados y su puntaje es: "+ puntaje[4]);
                 if (puntaje[4]==puntaje[3]){
         System.out.println(" Los caballos "+c4 +" y"+ c5+ "quedaron empatados y su puntaje es: "+ puntaje[4]);   
                 }
             }
         }
     }
     if (puntaje[3]== puntaje[0]){
         System.out.println(" Los caballos "+c1+" y"+ c5+" quedaron empatados y su puntaje es: "+ puntaje[3]);
         if (puntaje[3]==puntaje[1]){
         System.out.println(" Los caballos "+c2 +" y"+ c5+ "quedaron empatados y su puntaje es: "+ puntaje[3]);
             if (puntaje[3]==puntaje[2]){
         System.out.println(" Los caballos "+ c3+ "y"+ c5+" quedaron empatados y su puntaje es: "+ puntaje[3]);
             }
         }
     }
     if (puntaje[2]== puntaje[0]){
         System.out.println(" Los caballos "+c1+ " y " +c5+" quedaron empatados y su puntaje es: "+ puntaje[2]);
         if (puntaje[2]==puntaje[1]){
         System.out.println(" Los caballos "+c2 +"y"+ c5+" quedaron empatados y su puntaje es: "+ puntaje[2]);
         }
     }
 }  
}
