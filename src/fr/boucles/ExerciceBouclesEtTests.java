package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		
		for (int i = 0; i < array.length; i++) { 
			 System.out.println(array[i]);	 // affichage de tous les éléments du tableau 
		}
		
		for (int i = array.length-1; i >= 0; i--) { 
			  System.out.println(array[i]);	 // affichage de tous les éléments du tableau dans l'ordre inverse 
		}
		 

		
		for (int i = 0; i < array.length; i++) {
		  
			if (array[i] > 3) { 
				System.out.println(array[i]); // affichage de tous les éléments du tableau supérieurs à 3 
			} 
		}
		  

		for(int i = 0;i<array.length;i++) {

			if (array[i] % 2 == 0) {
				System.out.println(array[i]); // affichage de tous les éléments du tableau entiers pairs
			}
		}
		
		for(int i = 0;i<array.length;i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]); // affichage de tous les éléments des index pairs
			}
		}

		for(int i = 0;i<array.length;i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]); // affichage de tous les éléments du tableau entiers impairs
			}
		}
	}
}
