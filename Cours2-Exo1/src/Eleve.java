/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lug13995
 */

public class Eleve implements Cloneable, Comparable<Eleve>{
    
    String nom;
    double moyenne;
    Adresse adr;
    
    public String getNom()
    {
        return nom;
    }
    
    public double getMoyenne()
    {
        return moyenne;
    }
    
    public Eleve(String n)
    {
        nom = n;
        System.out.println(adr);
    }
    public Eleve(String n, double m) //throws Exception
    {
        /*if(n == "AAA")
        {
            Exception e ;
            throw e = new Exception();
        }*/
          
        nom = n;
        moyenne = m;
    }
    
    Eleve compare(Eleve e) 
    {
        
        if(nom.compareTo(e.nom) > 0)
        {
            return e;
        }
        else
            return this;
    }
    

    
    public boolean equals(Object o)
    {
        if(!(o instanceof Eleve))
           return false;
        
        Eleve e = (Eleve)o;
        return this.nom.equals(e.getNom()) && this.moyenne == e.getMoyenne();
    }
    
    public boolean ami(Eleve e1) throws Exception
    {
        if(this.nom.equals(e1.nom)) 
        {
            
            throw new Exception();
        }
        return true;
    }
    
    public Object clone() throws CloneNotSupportedException
    {
        Eleve temp = (Eleve) super.clone();
        temp.adr = (Adresse) adr.clone();
        return temp;
    }

    @Override
    public int compareTo(Eleve e) {
        if(this.moyenne < e.moyenne)
            return -1;
        else{
            if(this.moyenne > e.moyenne)
                return 1;
            else 
                return 0;
        }
    }
}
