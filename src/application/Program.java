package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
				
		Employee worker = new Employee();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" + (i+1) +" data:" );
			System.out.print("Outsourced? (y/n)");
			sc.nextLine();
			String response = sc.nextLine();
			if(response.equals("y")) {
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Hours:");
				int hours = sc.nextInt();
				System.out.print("Value per hour:");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge:");
				double additionalCherge = sc.nextDouble();
				Employee employee2 = new OutsourcedEmployee(name, hours, valuePerHour, additionalCherge);
				worker.addWorker(employee2);
			} else {
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Hours:");
				int hours = sc.nextInt();
				System.out.print("Value per hour:");
				double valuePerHour = sc.nextDouble();
				Employee employee1 = new Employee(name, hours, valuePerHour);
				worker.addWorker(employee1);
			}
			
		}
		System.out.println("Payments:");
			System.out.println(worker.toString());
		
		sc.close();
	}

}
