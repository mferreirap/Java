package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Person;
import entities.Rooms;

public class Motel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberOfRooms = 10;

		ArrayList<Rooms> rooms = new ArrayList<Rooms>(numberOfRooms);
		for (int i = 0; i < numberOfRooms; i++) {
			int numberRoom = i + 1;
			char empty = 'Y';
			rooms.add(new Rooms(numberRoom, empty));
		}

		System.out.println("Please, inform the number of students: ");

		int n = sc.nextInt();

		// Person[] student = new Person[n];

		ArrayList<Person> student = new ArrayList<Person>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Declare the name of student: ");
			sc.nextLine();
			String name = sc.nextLine();
			String email = name + "@hotmail.com";
			System.out.println("Declare the room of student: ");
			int roomChoice = sc.nextInt();
			if (roomChoice <= 0 || roomChoice > numberOfRooms) {
				System.out.println("Please, take a valid room (1-10)");
			} else {
				if (rooms.contains(roomChoice) && rooms.get(roomChoice).getEmpty() == 'Y') {
					rooms.get(roomChoice).setEmpty('N');
				} else {
					while (rooms.contains(roomChoice) && rooms.get(roomChoice).getEmpty() == 'N') {
						System.out.println("Please, take a empty room");
						roomChoice = sc.nextInt();
					}
					rooms.get(roomChoice).setEmpty('N');
				}

				student.add(new Person(name, email, roomChoice));
			}

			Collections.sort(student, Comparator.comparing(Person::getRoomChoice));

		}
		
		System.out.println();

		System.out.println("Busy rooms:");
		for (int i = 0; i < n; i++) {
			if (student.isEmpty() == false) {
				System.out.println(student.get(i).getRoomChoice() + ": " + student.get(i).getName() + ", "
						+ student.get(i).getStudentEmail());
			}
		}

		sc.close();
	}

}
