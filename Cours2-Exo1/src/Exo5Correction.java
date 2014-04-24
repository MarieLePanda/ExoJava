public class Exo5Correction {
//Debut classe
    
    public static boolean isIn(String word, String[] dictionary)
    {
        boolean found = false;
        int i = 0;
        while(i < dictionary.length)
        {
            if(word.equals(dictionary[i]))
            {
                found = true;
            }
            
            i++;
        }
        return found;
    }
    
    static boolean oneLetterDif(String a, String b)
    {
        int counter = 0;
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
            {
                counter++;
            }
        }
        return counter == 1;
    }
    
    static void neighbours(String word, String[] dictionary)
    {
        for(int i = 0; i < dictionary.length; i++)
        {
            if(oneLetterDif(word, dictionary[i]) && !word.equals(dictionary[i]))
            {
                System.out.println(dictionary[i]);
            }
        }
    }
    
    static int numberOfNeighbours(String word, String[] dictionary)
    {
        int i, counter = 0;
        for(i = 0; i < dictionary.length; i++)
        {
            if(oneLetterDif(word, dictionary[i]) && !word.equals(dictionary[i]))
            {
                counter++;
            }
        }
        
        return counter;
    }
    
    static String[] listOfNeighbours(String word, String[] dictionary)
    {
        String[] l = new String[numberOfNeighbours(word, dictionary)];
        int k = 0, i;
        for(i = 0; i < dictionary.length; i++)
        {
            if(oneLetterDif(word, dictionary[i]) && !word.equals(dictionary[i]))
            {
                l[k] = dictionary[i];
            }
            i++;
            
        }
        
        return l;
    }
    
    static String[] unionSets(String[] e, String[] f)
    {
        String[] inter = new String[e.length + f.length];
        int i = 0;
        for(; i < e.length; ++i)
        {
            inter[i] = e[i];
        }
        
        for(int j = 0; j < f.length; ++j)
        {
            if(!isIn(f[j], e))
            {
                inter[i] = f[j];
            }
            ++i;
        }
        //taille ajusté
        String[] union = new String[i];
        for(int k = 0; k < i; ++k)
        {
            union[k] = inter[k];
        }
        
        return union;
    }
    
    static String[] setOfNeighbours(String[] list, String[] dictionary)
    {
        String[] res = new String[0];
        for(int i = 0; i < list.length; i++)
        {
            res = unionSets(res, listOfNeighbours(list[i], dictionary));
        }
        
        return res;
    }
    
    static String[] findableWords(String word, String[] dictionary)
    {
        //Ensemble des mots recontrés
        String[] res = new String[1];
        res[0] = word;
        //Ensemble des mots voisin de res
        String[] voisin;
        while(true)
        {
            voisin = setOfNeighbours(res, dictionary);
            String[] newRes = unionSets(res, voisin);
            if(newRes.length == res.length) //Tout est trouvé
            {
                return res;
            }
            res = newRes;
        }
    }
    
    static void printList(String[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] !=null)
            {
                System.out.println(list[i] + " ");
            }
            System.out.println("\n");
        }
    }
}
