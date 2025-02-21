package filehandling.Readthedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	     File f2 = new File("C:\\Users\\pabbineedi.saivinay\\eclipse-workspace\\JAVA\\Readfile.txt");
	     
	     
	     Scanner s1 = new Scanner(new FileInputStream(f2));
	     
	     while(s1.hasNext())
	     {
	    	System.out.print(s1.nextLine()+"\n"); 
	     }
	      
	}

}
