package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createfile {

	public static void main(String[] args) {
		// to create file

		File newfile= new File("E:\\Software Testing\\abc.txt");

		try {
			newfile.createNewFile();
		} catch (IOException e) {
			System.out.println("file not created");
			e.printStackTrace();
		}

		//to write into file by file writer class

		try {
			FileWriter fw=new FileWriter("E:\\Software Testing\\abc.txt");
			fw.write("this is java file document created by filwriter class");	
			fw.close();
		}
		catch (IOException e) {
			System.out.println("issue while writing text");
			e.printStackTrace();
		}
		finally {

			System.out.println("text is return in file"); 
		}


		//to read from the file

		File newfile1= new File("E:\\Software Testing\\abc.txt");

		try {
			Scanner sc=new Scanner(newfile1);

			while(sc.hasNextLine()) {

				String s=sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		//to delete from file


		File newfile2= new File("E:\\Software Testing\\abc.txt");

		newfile2.delete();

	}

}
