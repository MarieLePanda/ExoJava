public class Exo2 
{
    //Début classe
    
    private int nombre;
    private int cpt;

    public int getCpt() {
        return cpt;
    }
    
    public Exo2()
    {
        this.nombre = 0;
        this.cpt = 0;
    }
    
    public int f(int n)
    {
        nombre = n;
        
        if(nombre == 1)
        {
            cpt++;
            return nombre;   
        }
        else
        {
            if(nombre%2 == 0)
            {
                nombre = f(nombre/2) ;
            }
            else
            {
                nombre = f(nombre * 3 + 1) ;

            }
            cpt++;
            return this.nombre;
        }
    }
    
    //Fin classe
}
