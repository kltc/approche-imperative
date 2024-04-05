package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		Random rand = new Random(); // création d'une instance de classe Random
        int randInt = rand.nextInt(100) + 1; //par défaut le nombre est compris entre 0 et 99, j'ajoute +1 pour que ce soit entre 1 et 100
        
        //System.out.println("Nombre aléatoire compris entre 1 et 100 : " + randInt);
        
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        
    	System.out.println("Saisir nombre entre 1 et 100");
          
        do {      
        	nb = scanner.nextInt();
        	if (nb > randInt) {
        		System.out.println("Le nombre recherché est plus petit que " + nb);
        	}
        	else if (nb == randInt) {
        		System.out.println("Bravo, le nombre recherché était " + nb);
        	}
        	else {
        		System.out.println("Le nombre recherché est plus grand que " + nb);
        	}
        } while (nb != randInt);

		
	}

}
