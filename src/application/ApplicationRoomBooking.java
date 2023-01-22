package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RoomBooking;

public class ApplicationRoomBooking {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Set Locale to use dot as decimal separator
		Scanner sc = new Scanner(System.in);
		
		RoomBooking[] roomBooking = new RoomBooking[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			roomBooking[room] = new RoomBooking(name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (roomBooking[i] != null) {
				System.out.println(i + ": " + roomBooking[i]);
			}
		}
	
		sc.close();

	}
}
