package application;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationNegatives {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many numbers will you type?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Negative numbers: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}
}
