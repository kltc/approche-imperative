package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		
		System.out.println("Nombres de 1 à 10 avec for");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " "); // affiche les nombres entiers de 1 à 10		
		}
		
		System.out.println("\n\nNombres pairs de 0 à 10 avec for");
		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.print(j + " "); // affiche tous les nombres pairs entre 0 et 10
			}
		}
		
		System.out.println("\n\nNombres impairs de 0 à 9 avec for");
		for (int k = 0; k <= 9; k++) {
			if (k % 2 != 0) {
				System.out.print(k + " "); // affiche tous les nombres impairs entre 0 et 9
			}
		}
		
		int l = 1;
		System.out.println("\n\nNombres de 1 à 10 avec while");
		while (l <= 10) {
			System.out.print(l + " "); //affiche les nombres entiers de 1 à 10
			l++;
		}
		
		int m = 0;
		System.out.println("\n\nNombres pairs de 0 à 10 avec while");
		while (m <= 10) {
			if (m % 2 == 0) {
				System.out.print(m + " "); //affiche les nombres pairs entre 0 à 10
			}
			m++;
		}
		
		int n = 0;
		System.out.println("\n\nNombres pairs de 0 à 9 avec while");
		while (n <= 9) {
			if (n % 2 != 0) {
				System.out.print(n + " "); //affiche les nombres impairs entre 0 à 9
			}
			n++;
		}
	}

}
