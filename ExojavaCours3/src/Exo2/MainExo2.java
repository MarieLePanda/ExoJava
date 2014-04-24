/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author lug13995
 */
public class MainExo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Angle unAngle = new Angle(20);
        System.out.println(unAngle.addition(new Angle(200)).getDegre());
        System.out.println(unAngle.soustraction(new Angle(40)).getDegre());
        System.out.println(unAngle.multiplication(new Angle(2)).getDegre());
        System.out.println(unAngle.equalite(new Angle(2)));
        System.out.println(unAngle.equalite(unAngle));
    }
}
