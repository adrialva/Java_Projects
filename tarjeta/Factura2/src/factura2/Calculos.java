/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ADRIANA
 */
public class Calculos {
    private double ip;
    private double ic;
    
 public Calculos(){
     ip=0;
     ic=0;
 }   
 public void Setip( double b){
     ip=b;
 }
 public void Setic( double c){
     ic=c;
 }
 public double Getip(){
     return ip;
 }
 public double Getic(){
     return ic;
 }
 public double Pedirp(){
     double prc;
     Scanner input = new Scanner(System.in);
     //double a1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite el precio del producto"));
     System.out.println(" Digite el precio del producto");
     prc= input.nextDouble();
     return prc;
 }   
 public double Pedirc(){
     double cnt;
     Scanner input = new Scanner(System.in);
     System.out.println(" Digite la cantidad comprada del producto");
     cnt= input.nextDouble();
     return cnt;
 }
}
