package ForPracticeOnly;
//call by reference
public class Practice {

	int a=20;
	int b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice p=new Practice();
		int ad =p.add(10, 40); // call by value
		System.out.println(ad); 
           
		p.swap(p);//call by reference
		System.out.println(p.a);
		  System.out.println(p.b);
	}

public int swap(Practice s) {
	
int temp =s.a;
     s.a=s.b;
     s.b=temp;
     
     return temp;
    }
	
public int add(int x, int y) {
	
	int z=x+y;
	
	return z; 
	}
}
