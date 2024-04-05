package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifsStockageNombre {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		int nb = 0;
		int[] array = new int[3];
		
		int i = 0;
		
		do {
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			menu = scanner.nextInt();
			
			switch (menu) {
				case(1) :
					if (i < array.length) {
						System.out.println("Saisir le nombre à ajouter");
						nb = scanner.nextInt();
						array[i] = nb;
						i++;
						break;
					}
					else {
						System.out.println("Tableau plein, je l'agrandis");
						array = Arrays.copyOf(array, array.length + 1); //agrandis array à partir d'une copie puis le reaffecte à array
						System.out.println("Saisir le nombre à ajouter");
						nb = scanner.nextInt();
						array[i] = nb;
						array[array.length - 1] = nb;
						i++;
						break;
					}
				case(2) : 
					System.out.println("Tableau :");
				
					for (int j = 0; j < array.length; j++) { 
						 System.out.print(array[j] + " ");
					}
					System.out.println("\n");
				break;
				default : System.out.println("Choix invalide, entrer 1 ou 2");
			}
		} while (menu != 2);
				
		
	}

}
