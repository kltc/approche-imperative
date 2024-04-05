package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10]; 
		
		System.out.println("Vous allez saisir 10 nombres");
		for (int i = 0; i < array.length; i++) {
				System.out.println("Saisir nombre " + (i+1));
				int nb = scanner.nextInt();
				array[i] = nb;
		}
		
		int max = Arrays.stream(array).max().getAsInt(); //permet de récupérer la plus grande valeur du tableau
		System.out.println("Le plus grand nombre entré est : " + max);
	}

}
