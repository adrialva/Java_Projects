/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasombreada;
import javax.swing.JOptionPane;
/**
 *
 * @author ADRIANA
 */
public class TestArea {
    
    public static void main (String [] args){
      /*  float a1 = Float.parseFloat(JOptionPane.showInputDialog("digite el area del cuadrado"));
        float a2 = Float.parseFloat(JOptionPane.showInputDialog("digite el area del circulo"));
*/
        Menu oc= new Menu();   
       /* if (a1<=a2){
            System.out.println(" Recuerde que el area del cuadrado debe ser mayor que el area del circulo");
        }
        else{
        oc.muestra(a1, a2);*/
        oc.menu();
    }
}
