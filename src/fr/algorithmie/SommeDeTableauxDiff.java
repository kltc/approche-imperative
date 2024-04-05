package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		
		int maxLength = Math.max(array1.length, array2.length); //détermine la longueur du plus grand tableau
		//int minLength = Math.min(array1.length, array2.length); //détermine la longueur du plus petit tableau
		
		int[] array3 = new int[maxLength];
		
		System.out.println("Tableau 1 :");
		
		for (int i = 0; i < array1.length; i++) { 
			 System.out.print(array1[i] + " ");
		}
		
		System.out.println("\n\nTableau 2 :");
		
		for (int i = 0; i < array2.length; i++) { 
			 System.out.print(array2[i] + " ");
		}

		System.out.println("\n\nSomme des 2 tableaux : ");
		for (int i = 0; i < maxLength; i++) {
			
			boolean inBounds1 = (i >= 0) && (i < array1.length); // booléen pour vérifier si un index est valide, renvoie true si c'est le cas sinon false
			boolean inBounds2 = (i >= 0) && (i < array2.length);
			
			if (inBounds1 == true && inBounds2 == true) { // si les 2 index sont valides, l'addition est faite avec les 2
				array3[i] = array1[i] + array2[i];
			}
			
			else if (inBounds1 == true && inBounds2 == false) { // s'il n'y a pas de valeur dans le tableau 2, on n'ajoute que celle du tableau 1
				array3[i] = array1[i];
			}
			
			else if (inBounds1 == false && inBounds2 == true) { // n'est pas censé arriver avec les tableaux définis, mais aurait pu si le tableau 2 était plus long 
				array3[i] = array2[i];
			}
			
			System.out.print(array3[i] + " ");
		}	
	}
}
