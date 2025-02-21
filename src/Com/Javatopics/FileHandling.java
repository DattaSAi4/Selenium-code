/*//File Handling:The File class from the java.io package, allows us to work with files.

To use the File class, create an object of the class, and specify the filename or directory name

how  can we read the file?

 by four ways we can read the file 
 1.fileinputstream
 2.scanner
 3.filereader
 4.bufferreader
*/
package Com.Javatopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\pabbineedi.saivinay\\eclipse-workspace\\JAVA\\vinay.txt");
		
		/*
		 * if(file.exists()) { file.delete(); }
		 * System.out.println(file.createNewFile());
		 */
		
		FileInputStream f1 = new  FileInputStream(file);
		int asiic ;
		while(((asiic=f1.read()) !=-1))
		{
		System.out.print((char)asiic);
		   
		}
	
	}

}
