package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductConstrutor;

public class ApplicationProductConstrutor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		ProductConstrutor product = new ProductConstrutor(name, price, quantity); // Instantiating with constructor
		
		System.out.println("Product data: " + product); // It is not necessary to call toString() method
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
