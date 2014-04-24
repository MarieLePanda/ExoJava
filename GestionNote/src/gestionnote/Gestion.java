
public class Gestion {

	public static void affich(Note[][] tableau){
		for(Note[] e : tableau){
			System.out.print("Eleve : ");
			for(Note n : e){
				System.out.print(n.getMatiere() + " : " + n.getVal() + ", ");
			}
			System.out.print("\n");
		}
	
	}
	
	public static float calMoyenne(Note[][] tableau, int rang){
		
		float resultat = 0;
		int i;
		for(i = 0; i < tableau[rang].length; i++){
			resultat += tableau[rang][i].getVal();
		}
		resultat /=i;
		
		return resultat;
		
	}
	
	public static void add(Note[][] tableau, int rang, String matiere, float val){
		
		System.out.print(tableau[rang].length);
		tableau[rang][tableau[rang].length] = new Note(val, matiere);
		
	}
	
	public static float[] moyennes(Note[][] tableau){
		
		int j = 0;
		float[] resultat = new float[tableau.length];
		for(Note[] e : tableau){
			
			float moyenne = 0;
			int i = 0;
			for(Note n : e){
				moyenne += n.getVal();
				i++;
			}
			resultat[j] = moyenne /=i;
			j++;			
		}
		
		return resultat;
	}
}
