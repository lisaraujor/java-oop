package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ApplicationTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area of triangle X: " + areaX);
		System.out.println("Area of triangle Y: " + areaY);
		
		System.out.println((areaX > areaY) ? ("The area of ​​triangle X is greater") : ("The area of ​​triangle Y is greater"));
		
		sc.close();

	}

}
