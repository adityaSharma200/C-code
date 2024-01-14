import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fileio {

	public static void main(String[] args) {
	 
		String dir = "D:\\Aditya Sharma\\java" ;
		
		String filename = "java.java";
		File obj  = new File(dir,filename);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any txt :");
		String txt = sc.nextLine();
		
		try {
			
			FileWriter file = new FileWriter(obj);
			
			file.write(txt);
			file.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("File is created .");
	}

}
