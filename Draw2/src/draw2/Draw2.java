
package draw2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ADRIANA
 */
public class Draw2 extends JPanel{
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Draw2 ob1 = new Draw2();
        ob1.FUScreen();// TODO code application logic here
    }
    
}
