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
public class Factura2 {
private double cantidad;
private double precio;

 Scanner input = new Scanner(System.in);
 
  public Factura2(){
      cantidad=0;
      precio=0;
  }
  public void Set1p(double p){
      precio=p;
  }
  public void set2c(double c){
      cantidad=c;
  }
  public double get1p(){
      return precio;
  }
  public double get2c(){
      return cantidad;
  }
    public double Proceso(){
        double sbtotal;
        double iva;
        double total;
        
        Calculos precio1 = new Calculos();
        precio1.Setip(precio1.Pedirp());
        Calculos cnt = new Calculos();
        cnt.Setic(cnt.Pedirc());
    
        precio = precio1.Getip();
        cantidad = cnt.Getic();
        
        sbtotal = cantidad*precio;
        iva = sbtotal*0.17;
        total = sbtotal + iva;


        //double a1 = Double.parseDouble(JOptionPane.showInputDialog(" Su total a pagar es "+total));        
        System.out.println(" su total a pagar es: "+total);
        return total;
    }
}
