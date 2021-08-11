package JavaBasicsConstructor;

public class ThisKeyword {

    String emp_name; //global variables
	int emp_id;
	float emp_salary;
	
  public static void main(String[] args) {
		
		ThisKeyword tk= new ThisKeyword("ashish", 123, 12345);
	
		 
		 System.out.println(tk.emp_name+" "+tk.emp_id+" "+tk.emp_salary);

		
	}
	
ThisKeyword(String emp_name,int emp_id,float emp_salary){ //local variables
	
	this.emp_name=emp_name; //this keyword assigned values to global vars
	this.emp_id=emp_id;
	this.emp_salary=emp_salary;
	
	}
	
	

}
