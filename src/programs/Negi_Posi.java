package programs;

import java.util.Scanner;

public class Negi_Posi {

	public static void main(String[] args) {

		int number;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Numeber : ");

		number = sc.nextInt();

		if (number < 0) {

			System.out.println("Given number is a negative number");

		}

		else if (number == 0) {
			System.out.println("given number is a zero number");

		} 
		else {

			System.out.println("number is positive number");

		}
	}
}