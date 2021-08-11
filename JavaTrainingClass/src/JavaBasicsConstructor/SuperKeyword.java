package JavaBasicsConstructor;

public class SuperKeyword {
	
  	
	public SuperKeyword(){
		
		System.out.println("Super Calling default");
		
	}
	   	
		
		public SuperKeyword(int i){
			
			System.out.println("Super calling one para");
			System.out.println(i);
		}

		public SuperKeyword(int x,int y){
			
			int z=x+y;
			System.out.println(z);
		}
		
	}


