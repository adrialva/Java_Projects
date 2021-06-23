package cuenta;

import java.util.Scanner;


public class Ingreso{
    private String idpN; //datos persona
    private int idpE;//datpos cuenta
    private String idpDNI;
 public Ingreso(){
     idpN="a";
     idpE=0;
     idpDNI="a";
 }   
 public void SetNP( String b){
     idpN=b;
 }
 public String GetNP(){
     return idpN;
 }
 
 public void SetED( int c){
     idpE=c;
 }
 public int GetED(){
     return idpE;
 }
 public void SetpDNI( String b){
     idpDNI=b;
 }
 public String GetpDNI(){
     return idpDNI;
 }
 public String PedirNp(){
     String pdp;
     Scanner input = new Scanner(System.in);
     //double a1 = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese su nombre"));
     System.out.println(" Ingrese su nombre");
     pdp= input.nextLine();
     return pdp;
 }   
 public int PedirED(){
     int pE;
     Scanner input = new Scanner(System.in);
     //double a1 = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese su nombre"));
     System.out.println(" Ingrese su edad");
     pE= input.nextInt();
     return pE;
 }   
 public String PedirDNI(){
     String pdNI;
     Scanner input = new Scanner(System.in);
     //double a1 = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese su nombre"));
     System.out.println(" Ingrese su DNI ");
     pdNI= input.nextLine();
     return pdNI;
 }   
}
