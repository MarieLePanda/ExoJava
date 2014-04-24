package ProfMath;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Eleve e = new Eleve();
            Delegue d = new Delegue();
            Professeur p = new Professeur();
            
            e.init();
            p.traitement(d, e);
	}

}
