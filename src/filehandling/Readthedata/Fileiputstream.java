package filehandling.Readthedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileiputstream {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\pabbineedi.saivinay\\eclipse-workspace\\JAVA\\Readfile.txt");
		         
		  FileInputStream f1 = new FileInputStream(file);
		   
		 
			
		  int asiic;
		  while((asiic=f1.read())!=-1) 
		  {
			  char d1 = (char)asiic;

			  System.out.print(d1);
		  }
			 
			/*
			 * while(f1.read()!=-1) { int f2 = f1.read(); System.out.print(((char)f2)); }
			 * f1.close();
			 */
		  
		  
		
	}

}
