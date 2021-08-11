package programs;

import java.util.Scanner;

public class Additiom {

	public static void main(String[] args) {
		
	//addition	
	int a, b, c;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter value for a: ");
	
	
	a=sc.nextInt();
	System.out.println("Enter value for b: ");
	b=sc.nextInt();
	c=a+b;
	System.out.println("addition of a and b is "+c);
	
	c=a-b;	
	System.out.println("Subtraction of a and b is "+c);
	
	c=a*b;
	System.out.println("Multipilication of a and b is "+c);
	
	c=a/b;
	System.out.println("Dividetion of a and b is "+c);
		
	}

}
