package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Saisir un nombre");
		int nb = scanner.nextInt();
		
		System.out.println("Les 10 nombres suivants sont :");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(nb+i + " ");
		}
	}

}
