/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingBase;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lug13995
 */
public class MaJFrame extends JFrame{
    
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Ceci est un JLabel");
    public MaJFrame(){
        super();
        this.build();
    }
    
    private void build(){
        
        //Option fenêtre
        this.setTitle("Ma première JFrame");
        this.setSize(320, 240); 
        this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        this.setResizable(true); //On interdit la redimensionnement de la fenêtre
        this.setContentPane(panel);
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        //Jpanel
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.red);
        panel.add(label);
        
        
    }
    
}
