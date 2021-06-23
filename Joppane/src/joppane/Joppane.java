/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joppane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author ADRIANA
 */
public class Joppane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        JOptionPane.showMessageDialog(null, " Bienevenido ");
        String Temp = JOptionPane.showInputDialog(" Ingrese su temperatura ");
        JOptionPane.showMessageDialog(null, " Su temperatura en Celcius es: " + Temp);
        int temp = Integer.parseInt(Temp);
        op = temp*9/5+32;
        JOptionPane.showMessageDialog(null, " Su temperatura en farenheit es: " + op);
        if (op>38){
            JOptionPane.showMessageDialog(null, "Advertencia su temperatura es muy alta ", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "su temperatura es baja ", "Mensaje en la barra de titulo", JOptionPane.INFORMATION_MESSAGE);
        
        }
        // centirados a farenheit menor a 38 
// TODO code application logic here
    }
    
}
