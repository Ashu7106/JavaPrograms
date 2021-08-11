package OOPConceptPart1;


public class FunctionInJava {

  int i;
  int l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInJava m=new FunctionInJava();
		
		m.book();

		int c1=m.mobile();
		
		System.out.println(c1);
		
		
		String h=m.laptop("hello_", "_world");
		
		System.out.println(h);
		
	}
		
		
		
		
		//no input no output
	
		public void book() {	//no arguments passing in parameters
			
		System.out.println("new book");
		}

		//no input but getting output
		
		public int mobile() { // no arguments passing in parameters
			
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Return output");
		return c;
		}
		
		//giving input getting output
		
		public String laptop(String a,String b) { // arguments passing in parameters
			
		String c=a+b;
				
		System.out.println("return c");		
			
		return c;	
			
			}
	
	
}
