package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] villes = {"Grenoble", "Lyon", "Montpellier", "Marseille", "Paris"};
		
		for (int i = 0; i < villes.length; i++) {
			int j = i+1;
			System.out.println("Ville " + j + " : " + villes[i]);
		}
		
		System.out.println("Il y a " + villes.length + " villes");
		
		villes[3] = "Reims";
		
		for (int i = 0; i < villes.length; i++) {
			int j = i+1;
			System.out.println("Ville " + j + " : " + villes[i]);
		}

	}

}
