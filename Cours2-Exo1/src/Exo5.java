public class Exo5 {
    //Debut classe
    
    static boolean uneLettreDif(String premierMot, String secondMot)
    {
        boolean res = false;
        int cpt = 0;
        for(int i = 0; i < premierMot.length(); i++)
        {
            if(premierMot.charAt(i) != secondMot.charAt(i))
            {
                cpt++;
            }
        }
        
        if(cpt == 1)
        {
            res = true;
        }
        return res;
    }
    
    static String[] motAccessible(String unMot, String[] listeMot)
    {
        String[] res = new String[listeMot.length];
        int cpt = 0;
        for(int i = 0; i < listeMot.length; i++)
        {
            if(uneLettreDif(unMot, listeMot[i]))
            {
                res[cpt] = listeMot[i];
                cpt++;
                
                unMot.toString();
            }
        }
        
        return res;
    }
}


