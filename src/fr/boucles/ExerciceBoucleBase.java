package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); // affiche les nombres entiers de 1 à 10
		}

		for (int j = 0; j < 20; j++) {
			System.out.println("Kevin LE"); // affiche 20 fois mon prénom et nom
		}

		for (int k = 2; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k); // print tous les nombres pairs entre 2 et 100
			}
		}

		for (int l = 1; l < 100; l++) {
			if (l % 2 != 0) {
				System.out.println(l); // print tous les nombres impairs entre 1 et 99
			}
		}
	}
}
