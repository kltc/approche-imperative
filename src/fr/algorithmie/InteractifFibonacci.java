package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int previousNumber = 0;
		int nextNumber = 1;
		
		System.out.println("Saisir le rang de la suite de Fibonacci");
		
		int rank = scanner.nextInt();
		
		System.out.println("La suite de Fibonacci de " + rank + " nombres est : ");
		for (int i = 1; i <= rank; i++) {
			System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}

	}

}
