package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisir un nombre");
		int nb = scanner.nextInt();
		int sum = 0;
		
		System.out.println("Sa somme arithmétique est :");
		
		for (int i = 1; i <= nb; i++) {
			sum += i;
			System.out.print(i);
			if (i < nb) {
				System.out.print(" + ");
			}
						
		}
		System.out.print(" = " + sum);
	}
}