/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursgraphique;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author lug13995
 */
public class monJPanel extends JPanel{
    
   @Override
   public void paint(Graphics g) {
	Color c = g.getColor();
	g.setColor(Color.RED);
	g.fillRect(10,10,80,80);
	g.setColor(Color.BLUE);
	g.fillOval(150,50,80,80);
        g.setColor(c);
   }
    
}
