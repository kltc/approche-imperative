package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {1, -4, 4, 19, 6, -9, 0, 6}; //doit retourner false
		//int[] array = {6}; //doit retourner true
		//int[] array = {6, -4, 4, 19, 6, -9, 0, 6}; //doit retourner true
		
		boolean control;
		
		if ((array.length == 1 && array[0] == 6) || (array[0] == 6 && array[array.length-1] == 6)) {
			control = true;
		}
		
		else {
			control = false;
		}
		
		System.out.println(control);
	}
}
