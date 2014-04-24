/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author lug13995
 */
public class Angle implements Cloneable {
    private int degre;
    
    public Angle(int unDegre)
    {
        degre = unDegre;
    }
    
    public Angle addition(Angle unAngle)
    {
      
      this.setDegre((degre + unAngle.getDegre())%360);
      return this;
    }
    
    public Angle soustraction(Angle unAngle)
    {
       if(this.degre > unAngle.getDegre())
       {
           this.setDegre((degre - unAngle.getDegre())%360);
       }
       else
       {
           this.setDegre((unAngle.getDegre() - this.degre)%360);
       }
       
       return this;
    }
    
    public Angle multiplication(Angle unAngle)
    {
      this.setDegre((degre * unAngle.getDegre())%360);
       return this;  
    }
    
    public boolean equalite(Angle unAngle)
    {
        System.out.println(this.getDegre());
        unAngle.getDegre();
        return this.getDegre() == unAngle.getDegre();
    }
    
    public int getDegre()
    {
        return degre;
    }
    
    public void setDegre(int unDegre)
    {
        degre = unDegre;
    }
    
     public Object clone() throws CloneNotSupportedException
    {
        Angle temp = (Angle) super.clone();
        return temp;
    }
}