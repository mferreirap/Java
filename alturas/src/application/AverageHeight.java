package application;

import entities.Person;

public class AverageHeight {

	public static double averageHeight(int x, Person[] p) {

		double averageHeight = 0.00;

		double sum = 0.00;

		for (int i = 0; i < p.length; i++) {
			sum += p[i].getHeight();
		}

		averageHeight = sum / x;

		return averageHeight;
	}
}
