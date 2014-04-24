
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Note[] eleve1 = {new Note(20,"java"), new Note((float) 19.5,"java"), 
				new Note(19,"C#"), new Note((float) 18.5,"C#"), 
				new Note(18,"UML"),  new Note((float) 17.5,"UML")};
		Note[] eleve2 = {new Note(17,"java"), new Note(16,"C#"), new Note(15,"UML")};
		
		Note[][] listeeleve = {eleve1, eleve2};
		Gestion.affich(listeeleve);
		
		System.out.println("moyenne : "  + Gestion.calMoyenne(listeeleve, 0));
		//Gestion.add(listeeleve, 0, "open", 20);
		//Gestion.affich(listeeleve);
		for(float m : Gestion.moyennes(listeeleve)){
			System.out.println(m);
		}
	}

}
