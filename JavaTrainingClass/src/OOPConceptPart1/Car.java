package OOPConceptPart1;

public class Car {

	int model =2015;
	int price=200000;
	
	
	public static void main(String[] args) {
		
		
		Car a=new Car();//1st object  of class Car.
		
		a.model=2016;
		System.out.println(a.model);
		
		Car b=new Car();// 2nd object of class Car.
		b.model=2017;
		System.out.println(b.model);
		
		Car c=new Car();// 3rd object of class Car.
		c.model=2018;
		System.out.println(c.model);
		
     //****Object Reference Shifting***********
		
		a=b; //value in b object will be given to object a....
		System.out.println(a.model);
		
		b=c;
		System.out.println(b.model);
		
		c=a;
		System.out.println(c.model);
		
		
		a.model=2010;
		System.out.println(a.model);
		
		c.model=2020;
		System.out.println(a.model);// we called it shifting of object reference from one object to another object
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
