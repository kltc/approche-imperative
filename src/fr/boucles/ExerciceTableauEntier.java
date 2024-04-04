package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		// int[] entiers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] entiers = new int[10];

		for (int i = 0; i < 10; i++) {
			entiers[i] = i + 1; // je déclare un tableau contenant tous les entiers de 1 à 10
		}

		System.out.println(entiers[0]);
		System.out.println(entiers.length);
		System.out.println(entiers[entiers.length - 1]);

		entiers[4] = 8;

	}

}
