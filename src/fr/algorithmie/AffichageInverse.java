package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Affichage des éléments du tableau :");
		
		for (int i = 0; i < array.length; i++) { 
			 System.out.print(array[i] + " ");	 // affichage de tous les éléments du tableau 
		}
		
		System.out.println("\n\nAffichage des éléments dans l'ordre inverse :");
		
		for (int i = array.length-1; i >= 0; i--) { 
			  System.out.print(array[i] + " ");	 // affichage de tous les éléments du tableau dans l'ordre inverse 
		}

		System.out.println("\n\nCopie des éléments de array dans un tableau arrayCopy :");
		
		int[] arrayCopy = new int[array.length];
		
		for (int i = 0; i < array.length; i++) { 
			 arrayCopy[i] = array[i]; // copie des éléments du tableau array dans arrayCopy 
			 System.out.print(arrayCopy[i] + " ");			 
		}
	}

}
