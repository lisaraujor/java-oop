package application;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationPeople {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people will you type? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		double sum = 0;
		int ageCounter = 0;
		
		for (int i = 0; i < n; i ++) {
			System.out.println((i + 1) + " person information: ");
			System.out.print("Name: ");
			names[i] = sc.next();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			sum += heights[i];
		}
		
		double avgHeights = sum / n;
		System.out.printf("Height average: %.2f%n", avgHeights);
		
		for (int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				ageCounter += 1;
			}
		}
		
		double percent = (ageCounter * 100) / n;
		System.out.printf("People under 16 years old: %.1f%%%n", percent);
		
		for (int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();

	}

}
