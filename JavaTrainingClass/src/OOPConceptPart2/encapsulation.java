package OOPConceptPart2;

public class encapsulation {
	
	private int Emp_id;
	private String Emp_Name;
	private int Emp_Sal;
	
   public static void main(String[] args) {
	
	  encapsulation ec= new encapsulation();
	  
	ec.Set_Emp_id(1234);  
	ec.Set_Emp_Name("Rahul Roy");
	ec.Set_Emp_Sal(50000);
	System.out.println(ec.getEmp_id()+" "+ec.get_Emp_name()+" "+ec.get_Emp_Sal());
	}

   public void Set_Emp_id(int Emp_id) {
	   
	  this.Emp_id=Emp_id;
	}
   
   public int getEmp_id() {
	   
	  return Emp_id; 
   }
   
   public void Set_Emp_Name(String Emp_Name) {
	   
		  this.Emp_Name=Emp_Name;
		}
	   
	   public String get_Emp_name() {
		   
		  return Emp_Name; 
	   }
   
   
	   public void Set_Emp_Sal(int Emp_Sal) {
		   
			  this.Emp_Sal=Emp_Sal;
			}
		   
		   public int get_Emp_Sal() {
			   
			  return Emp_Sal; 
		   }
   
   
   
   
   
   
   
}
