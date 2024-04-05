package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		//int[] array = {1, -4, 4, 19, 6, -9, 0, 6}; //doit retourner false
		//int[] array = {1}; //doit retourner true
		int[] array = {1, -4, 4, 19, 6, -9, 0, 1}; //doit retourner true

		boolean control;
		
		if (array.length >= 1 && (array[0] == array[array.length-1])) {
			control = true;
		}
		
		else {
			control = false;
		}
		
		System.out.println(control);
	}

}