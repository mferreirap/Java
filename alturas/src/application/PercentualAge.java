package application;

import entities.Person;

public class PercentualAge {

	public static double percentualAge(int x, Person[] p) {

		double percentualAge = 0.00;

		double personLowAge = 0.00;

		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() < 16) {
				personLowAge = +1;
			}
		}
		percentualAge = (personLowAge / p.length) * 100;

		return percentualAge;

	}
}
