package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		
		int[] entiers = {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println("L'élément du tableau d'index 0 est : " + entiers[0]);
		System.out.println("La longueur du tableau est : " + entiers.length);
		System.out.println("L'élément du dernier index est : " + entiers[7]);
		System.out.println("L'élément de l'index 10 est : " + entiers[10]); //erreur car il n'existe pas vu que le tableau s'arrête à l'index 7

	}

}
