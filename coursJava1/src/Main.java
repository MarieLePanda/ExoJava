/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
     
        
        /* Création d'un tabelau à plusieur dimension de différente longeur
        StringBuffer[][] tab = new StringBuffer[1][];
        int i;
        for(i = 0; i < tab.length; i++)
        {
            tab[i] = new StringBuffer[i+1];
        }
        */
        
        /* permutation de tableau
        int[] a = {10,10,10};
        int[] b = {35,35,35};
        int[] c = new int[3];
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "\n");
            System.out.print(b[i] + "\n");
        }
        
        c = a;
        a = b;
        b = c;
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "\n");
            System.out.print(b[i] + "\n");
        }       
        */
        
        //COURS NUMERO 2
        
        /*double euros, dollars;
        for(euros = 10; euros < 100; euros += 10)
        {
            dollars = euros * 1.396;
            
            System.out.println(euros + " euros = " + dollars + "$");
        }*/
        
        /* 
        //exo 1
        String mail = "adr@esgi.fr";
        int limite = mail.indexOf('@');
        String partie1 = "";
        String partie2 = "";
        String partie3 = "";
        int i = 0;
        //decomposer
        while(i<limite)
        {
            partie1 += mail.charAt(i);
            i++;

        }
        limite = mail.indexOf('.');
        i++;
        while(i<limite)
        {
            partie2 += mail.charAt(i);
            i++;
        }
        i++;
        limite = mail.length();
        
        System.out.println(partie1 + partie2 + partie3);
        */
        
        //COURS NUMERO 1
    }
}
