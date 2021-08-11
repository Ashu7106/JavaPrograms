package SeleniumTrainingPart2;

import java.util.ArrayList;
import java.util.Arrays;



public class prac {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
          //new of creating 1d Array
		
		int[] arr1 = { 1, 3, 4, 5, 6, 7, 7, 7, 8, 9, 9, 99, 9, 90, 0, 0, 00, 0, 0, 0, 0, 0, 0, 0, 0, 98, 77, 67 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);
		
		int[][] arrtwo= new int [3][5]; //[3 rows] [5 columns]
		
		arrtwo[0][0]=1;
		arrtwo[0][1]=1;
		arrtwo[0][2]=1;
		arrtwo[0][3]=1;
		arrtwo[0][4]=1;
		
		arrtwo[1][0]=1;
		arrtwo[1][1]=1;
		arrtwo[1][2]=1;
		arrtwo[1][3]=1;
		arrtwo[1][4]=1;
		
		arrtwo[2][0]=1;
		arrtwo[2][1]=1;
		arrtwo[2][2]=1;
		arrtwo[2][3]=1;
		arrtwo[2][4]=1;
		
		ArrayList arrrrr=  new ArrayList(Arrays.asList(1,2,33,4,5,56,6,6,6,7,77,8,8,8,9,9,9,9,9,9,9,0,0,00));
		
		
		//new of creating 2d Array
		int[][] arrtwo1= {{1,2,3},{4,5,6},{7,8,9}};// {1st row {columns}, 2nd row {columns}, 3rd row{columns} }
		

		System.out.println(Arrays.deepToString(arrtwo1));
		
	}

}
