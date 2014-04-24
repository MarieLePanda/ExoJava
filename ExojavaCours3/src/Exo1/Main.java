/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author lug13995
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personne individu;
        individu = new Personne("DURAN", "OUTIL JAVA SA");
        presente(individu);
    }
    
    public static void presente(Personne p)
    {
        System.out.println("Nom : " + p.getNom());
        System.out.println("Société : " + p.getSociete());
    }
}
