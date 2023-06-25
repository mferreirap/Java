package application;

import entities.Person;

public class PersonLowAge {

	public static void personLowAge(int x, Person[] p) {

		String nameLowAge;
		for (int i = 0; i < p.length; i++) {
			nameLowAge = p[i].getName();
			if (p[i].getAge() < 16) {
				System.out.println(nameLowAge);
			}
		}

	}
}
