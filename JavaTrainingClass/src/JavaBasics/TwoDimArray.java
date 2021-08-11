package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
	//Two dimension Array	
	
		String s[][]=new String[3][5];//Rows And Columns.
		
		
		s[0][0]="A";  //S[0] first row index. s[0] first column index of zero th row i.e 0,0
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E"; //S[0] first row index. s[4] 4th column index of first row i.e 0,4
		
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		s[1][4]="E1";
		
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="C2";
		s[2][3]="D2";
		s[2][4]="E2";
		
		
		System.out.println(s[2][2]);
		System.out.println(s[0][3]);
		System.out.println(s.length);
	    System.out.println(s[0].length);
	    
	    //To print all rows and columns in s we use two for loops.
	    
	    //***************loops execution*************************
	      /* row=0   col=0 to 4
	         row=1   col=0 to 4	 
	         row=2   col=0 to 4  */ 
	    
	    for(int row=0;row<s.length;row++) { // this is outer loop and will executed last.
	    	
	    	for(int col=0;col<s[0].length;col++)   //this is inner loop will be executed first.
	    	
	    	System.out.println(s[row][col]);
	    	
	    	}
	
	}

}
