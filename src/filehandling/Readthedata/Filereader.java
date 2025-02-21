package filehandling.Readthedata;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("./Readfile.txt");
		if(!f1.exists())
			f1.createNewFile();
		FileReader fr = new FileReader(f1);
		
		int asic;
		while((asic=fr.read()) !=-1)
		{
			System.out.print((char)asic);
		}
		fr.close();
		
		
	}

}
