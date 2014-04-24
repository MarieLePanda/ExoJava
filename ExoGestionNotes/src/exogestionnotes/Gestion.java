/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exogestionnotes;

/**
 *
 * @author lug13995
 */
public class Gestion {
    
    private Note[][] tabEleves;
    private int nbEleves = 0;
    
    public Gestion(Note[] tabNotes){
        this.tabEleves[this.nbEleves] = tabNotes; 
        this.nbEleves++;
    }
    
    public void ajouteEleve (Note[] tabNotes){
        this.tabEleves[this.nbEleves] = tabNotes; 
        this.nbEleves++;
    }
    
    public void afficherClasse(){
        for(Note[] e : this.tabEleves){
            for(Note n : e){
                System.out.print(n.getMatiere() + " : " + n.getVal());
            }
        }
    }
    
    
}
