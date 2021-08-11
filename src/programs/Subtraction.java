package programs;
import java.util.Scanner;

public class Subtraction {


	public static void main(String[] args) {

		//Subtraction	
		int a, b, c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value for a: ");


		a=sc.nextInt();
		System.out.println("Enter value for b: ");
		b=sc.nextInt();
		c=a-b;

		System.out.println("Subtraction of a and b is "+c);


	}

}



