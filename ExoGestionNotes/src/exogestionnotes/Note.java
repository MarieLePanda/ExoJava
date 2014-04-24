/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exogestionnotes;

/**
 *
 * @author lug13995
 */
public class Note {
    private float val;
    private String matiere;
    
    public Note(){
        this.val = 0;
        this.matiere = null;
    }

    public Note(String matiere, int val) {
        this.matiere = matiere;
        this.val = val;
    }
    
    public float getVal(){
        return this.val;
    }
    
    public void setVal(float val){
        this.val = val;
    }
    
    public String getMatiere(){
        return this.matiere;
    }
    
    public void setMatiere(String matiere){
        this.matiere = matiere;
    }
    
    
}
