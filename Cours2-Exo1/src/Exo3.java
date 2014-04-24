import java.util.ArrayList;

public class Exo3 
{
    //Début classe  
    
    public static double moyenne_nombre(String nombre[]) throws NumberFormatException
    {   
        double moyenne = 0;
        int i = 0;
        //try
        //{
            for(String n : nombre)
            {
                try
                {
                    moyenne += Integer.parseInt(n);
                    i++;
                }
                catch(NumberFormatException e)
                {
                    throw e;
                }
            }
            moyenne = moyenne/i;
            return moyenne;
        //}
        /*catch(NumberFormatException e)
        {
            System.out.println("Valeur incorect");
            return 0;
        }*/
        
    }
    //Fin classe
}
