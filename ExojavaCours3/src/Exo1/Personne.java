/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo1;

/**
 *
 * @author lug13995
 */
public class Personne {
   private String nom;
   private String societe;
   
   public Personne(String unNom, String uneSociete)
   {
       nom = unNom;
       societe = uneSociete;
   }
   
   public String getNom()
   {
       return nom;
   }
   
   public String getSociete()
   {
       return societe;
   }
}
