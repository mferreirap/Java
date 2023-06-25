package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Person;

public class personHeight {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Person[] person = new Person[n];

		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			System.out.println("Dados da " + (1 + i) + "ª pessoa: ");
			System.out.println("Nome: ");
			person[i].setName(sc.next());
			System.out.println("Idade: ");
			person[i].setAge(sc.nextInt());
			System.out.println("Altura: ");
			person[i].setHeight(sc.nextDouble());
		}
		System.out.printf("Altura média: %.2f%n", AverageHeight.averageHeight(n, person));
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", PercentualAge.percentualAge(n, person), "%");
		PersonLowAge.personLowAge(n, person);

		sc.close();

	}
}
