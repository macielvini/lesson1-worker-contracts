package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int nContracts = sc.nextInt();
		
		for(int i = 0; i < nContracts; i++) {
			System.out.printf("Enter contract %d data: \n",i);
			System.out.print("Date (DD/MM/YYYY): ");
			
		}
		
		sc.close();
	}

}
