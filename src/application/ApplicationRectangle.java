package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ApplicationRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter() + ", Diagonal: " + r.diagonal());
		
		sc.close();
	}

}
