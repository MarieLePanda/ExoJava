/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lug13995
 */
import java.lang.reflect.Method;
import java.util.*;
public class tpClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nameClasse = sc.nextLine();
        Class<?> parent;
        try{
           while(nameClasse != null){
                Class<?> c = Class.forName(nameClasse);
                System.out.println("Méthode de la classe : " + nameClasse);
                for(Method m : c.getDeclaredMethods())
                {
                    System.out.println(m.getName());
                }
                parent = c.getSuperclass();
                nameClasse = parent.getName();
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Erreur");
        }
    }
}
