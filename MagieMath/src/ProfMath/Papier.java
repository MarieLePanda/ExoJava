package ProfMath;

public class Papier {
    private int old;
    private int oldParent;
    
    public int getOld(){
        return old;
    }
    
    public void setOld(int old){
        this.old = old;
    }
    
    public int getOldParent(){
        return oldParent;
    }
    
    public void setOldParent(int oldParent){
        this.oldParent = oldParent;
    }
    
    public Papier(int old, int oldParent){
        this.old = old;
        this.oldParent = oldParent;
    }
    
}
