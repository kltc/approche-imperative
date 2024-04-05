package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		
		int[] arrayRotate = new int[array.length];
		
		System.out.println("Tableau original :");
		
		for (int i = 0; i < array.length; i++) { 
			 System.out.print(array[i] + " ");
		}
		
		System.out.println("\n\nTableau après rotation vers la droite :");
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == array.length-1) {
				arrayRotate[array.length-1] = array[array.length-2];
				arrayRotate[0] = array[array.length-1];
			}
			else {
				arrayRotate[i] = array[i-1];
			}
			
			System.out.print(arrayRotate[i] + " ");
		}

	}

}
