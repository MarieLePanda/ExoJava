
import SwingBase.*;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lug13995
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
       /* JWindow 
        MaJWindow jWin = new MaJWindow(); 
        jWin.setSize(300, 200);
        jWin.setVisible(true);
        
        Thread.sleep(5000);
        System.exit(0);
        */
        
        /* JDialog
        MaJDialog jDia = new MaJDialog();
        jDia.setTitle("Première JDialog");
        jDia.setSize(300,200);
        jDia.setVisible(true);
        */
        
        NewJFrame jframe = new NewJFrame();
        jframe.setVisible(true);
    }
}
