package programs;

import java.util.Scanner;

public class Identify_Age {

	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter age to identify: ");

		age = sc.nextInt();

		if (age < 18) {

			System.out.println("this person is child");

		}

		else if (age >= 60) {

			System.out.println("this person is senoir citizen");

		}

		else {

			System.out.println("this person is adult");

		}

	}

}