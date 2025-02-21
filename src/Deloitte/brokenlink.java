package Deloitte;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		           ChromeDriver driver = new ChromeDriver();
		           
		           driver.get("https://www.hyrtutorials.com/");
		           
		         List<WebElement> tagname = driver.findElements(By.tagName("a"));
		         
		          for(WebElement link:tagname)
		          {
		        	      String Linkurl=link.getAttribute("href");
		        	       URL url = new URL(Linkurl);
		        	     URLConnection s3 = url.openConnection();
		        	       HttpURLConnection s4 = (HttpURLConnection)s3;
		        	       s4.connect();
		        	       
		        	       if(s4.getResponseCode()==400)
		        	       {
		        	    	   System.out.println("Its a broken link");
		        	    	   }
		        	       else
		        	       {
		        	    	System.out.println("its not a broken link ");   
		        	       }
		        	       
		        	       }
		       
	}

}
