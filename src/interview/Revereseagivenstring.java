package interview;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Revereseagivenstring {
	
	public static void main(String[] args) {
		
		 String name ="saivinay";
		 
		 String name1 ="";
		 
		 
		 for(int i=0;i<=name.length()-1;i++)
		 {
			  char s1 = name.charAt(i);
			  
			         name1 = s1+name1;
			        
		 }
		 System.out.println(name1);
	}

}
