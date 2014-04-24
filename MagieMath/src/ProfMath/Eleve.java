package ProfMath;

import java.util.Scanner;

public class Eleve {

	private Papier paper;
	private int old;
	private int oldParent;
        
        public Papier getPaper(){
            return paper;
        }
        
        public void setPaper(Papier paper){
            this.paper = paper;
        }
	
	public void init(){
            System.out.println("Entrer l'age de l'élève");
            Scanner sc = new Scanner(System.in);
            old = sc.nextInt();
            System.out.println("Entrer l'age du parent");
            sc = new Scanner(System.in);
            oldParent = sc.nextInt();
            System.out.println("L'élève écrit papier");
            paper = new Papier(old, oldParent);
            System.out.println("L'élève montre papier");
            System.out.println("Age : " + paper.getOld() + " Age parent : " + paper.getOldParent());
            
            
	}
}
