package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Commodity;

public class ApplicationCommodity {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Commodity[] vect = new Commodity[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Commodity(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
