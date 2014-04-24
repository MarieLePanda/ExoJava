
public class Note {
	
	private float val;
	private String matiere;
	
	public Note(){
		this.val = 0;
		this.matiere = null;
		
	}
	
	public Note(float val, String matiere){
		this.val = val;
		this.matiere = matiere;
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
