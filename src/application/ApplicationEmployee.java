package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ApplicationEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Enter employee informations: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		System.out.println();
		System.out.print("Witch percentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Updated data: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		sc.close();
	}

}
