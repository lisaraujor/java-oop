package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ApplicationBankAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount; // Need to create outside the scope of if
		
		System.out.print("Enter account number: ");
		int number =  sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(number, holder, initialDeposit);
		}
		else {
			bankAccount = new BankAccount(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(bankAccount);
		
		sc.close();

	}

}