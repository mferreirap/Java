package exerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Company {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many employees will be registered? ");
	
		List<Employees> employees = new ArrayList<>(sc.nextInt());
		
		for (Employees i : employees) {
			employees.add(i);
			System.out.println("Employee #" + i + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			
			
		}
		

		sc.close();
	}

}
