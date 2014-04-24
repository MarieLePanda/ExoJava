package ProfMath;

public class Professeur {
       

        public void traitement(Delegue d, Eleve e){
            
            System.out.println("Délégué lit papier");
            d.setPaper( e.getPaper());
            System.out.println("Délégué calcule");
            int calc;
            calc = (d.getPaper().getOld()) * 2;
            calc += 5;
            calc *= 50;
            calc += d.getPaper().getOldParent();
            calc -= 365;
            
            System.out.println("Délégué annonce le résultat : " + calc);
            calc +=115;
            int oldStudent = calc/100;
            int oldParent = calc%100;
            System.out.println("Porfesseur annonce l'age");
            System.out.println("Etudiant : " + oldStudent);
            System.out.println("Parent : " + oldParent);
            
        }
}
