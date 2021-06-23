/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamouse;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ADRIANA
 */
public class Draw extends JPanel {
    JFrame frame;
    
    public void FUScreen(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.add(this);
    }
    public void paintComponent(Graphics G){
        
        Graphics2D G2D = (Graphics2D) G;
        
        G2D.setColor(Color.RED);
        G2D.fillRect(0, 0, 200, 100);
    }
    public static void main(String[] args){
        Draw ob1 = new Draw();
        ob1.FUScreen();
    }
}
