public class Exo4 {
    //Debut classe
    
    private String alphabet;
    private String chaine;
    private String motAnagrame;
    
    public Exo4(String alphabet, String chaine, String motAnagrame)
    {
        this.alphabet = alphabet.toLowerCase();
        this.chaine = chaine.toLowerCase();
        this.motAnagrame = motAnagrame;
    }
    
    public void fait_partie()
    {
        if(chaine.matches("([" + alphabet + "])*"))
        {
            System.out.println("Mot appartenant à l'alphabet");
        }
        else
        {
            System.out.println("Mot n'appartenant pas à l'alphabet");
        }
    }
    
    public String retourne_a_gauche(int n)
    {
        chaine = chaine.substring(n) + chaine.substring(0, n);
        return chaine;
        
    }
    
    public String retourne_a_droite(int n)
    {
        chaine = chaine.substring((chaine.length() - n), chaine.length()) + chaine;
        chaine = chaine.substring(0, chaine.length() - (n));
        return chaine;
    }
    
    public boolean anagrame()
    {
        return chaine.matches("[" + motAnagrame + "]");
    }
    //Fin classe
}
