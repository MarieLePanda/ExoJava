/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursgraphique;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author lug13995
 */
public class MaFenetre extends JFrame{  
    
    public MaFenetre()
    {
        this.getContentPane().add(new monJPanel());
        this.pack();
        this.setVisible(true);
        //this.addWindowListener(null);
    }
  
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
