
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cours2Exo 
{
    public static void main(String[] args) 
    {

        /*//Exo2
        Exo2 test1 = new Exo2();
        
        System.out.println(test1.f(1));
        
        for(int i = 1; i <= 50; i++)
        {
           System.out.println(i + " " + test1.f(i) + " en " + test1.getCpt() + " coups."); 
        }*/
        
        /*//Exo 3
        String tab[] = {"1","2", "4", "panda", "8"};
        try
        {
           System.out.println(Exo3.moyenne_nombre(tab)); 
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erreur de la fonction Exo3.moyenne_nombre");
            throw new RuntimeException();
        }*/
        
        //Exo 4
        /*Exo4 test4 = new Exo4(args[0], args[1], args[2]);
        test4.fait_partie();
        System.out.println(test4.retourne_a_gauche(3));
        System.out.println(test4.retourne_a_droite(3));
        System.out.println(test4.anagrame());*/
        
        //Exo 5
        /*System.out.println(Exo5.uneLettreDif("aza", "aze"));
        System.out.println(Exo5.uneLettreDif("aza", "aee"));
        System.out.println(Exo5.uneLettreDif("aza", "aza"));
        
        String[] tabmotgen = {"aas", "ace", "alu", "are", "api", "ays", "bec", "bel", "bey", "ben", "boy",
            "deb", "des", "dom", "dot", "daw", "fax", "fan", "faq", "fob", "hem", "hop", "man", "mao", "mug",
            "mus", "mie", "sur", "dey", "mur" };
        
        for(String m : Exo5.motAccessible("dey", tabmotgen))
        {
            System.out.println(m);
        }*/
        /*Eleve[] listEleve = {null, null, null};
        ArrayList <Eleve> arrayListEleve = new ArrayList <Eleve>();
       
        Eleve e1 = new Eleve("AAA");
        Eleve e2 = new Eleve("CCC");
        Eleve e3 = new Eleve("AAA");
        
        listEleve[0] = e1;
        listEleve[1] = e2;
        listEleve[2] = e3;
        
        
        for(Eleve e : listEleve)
        {
            System.out.println(e.nom);
        }
        
        try{
            System.out.println(e3.ami(e1));
        }
        catch(Exception e)
        {
           System.out.println("Erreur");
        }
        /*
        //System.out.println(e1.compare(e2).getNom());
        try {
            e2 = (Eleve) e1.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Cours2Exo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(e1.adr + " " + e2.adr);
        */
        
        //CompareTo
        
        Eleve e1 = new Eleve("E1", 18);
        Eleve e2 = new Eleve("E2", 15);
        Eleve e3 = new Eleve("E3");
        
        Eleve[] array = new Eleve[3];
        array[0] = e1;
        array[1] = e2;
        array[2] = e3;
        System.out.println("Tableau non trié");
        for(int i = 0; i < array.length; i++){
            System.out.println("Etudiant : " + array[i].nom + " Moyenne : " + array[i].getMoyenne());
        }
        Arrays.sort(array);
        System.out.println("Tableau trié");
        for(int i = 0; i < array.length; i++){
            System.out.println("Etudiant : " + array[i].nom + " Moyenne : " + array[i].getMoyenne());
        }
        
       
    }
}
