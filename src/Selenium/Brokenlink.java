package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.driver", "./Driver/chrome.driver");
		
		              ChromeDriver driver = new ChromeDriver();
		              
		              driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		              
		              List<WebElement> tag = driver.findElements(By.tagName("a"));
		              
		              for(WebElement link:tag)
		              {
		            	             
									String url = link.getAttribute("href"); 
									
									             URL d1 = new URL(url);
									             
									    URLConnection d2 = d1.openConnection();
									    
									  HttpURLConnection HttpUrlConnection =(HttpURLConnection) d2;
									  
									  HttpUrlConnection.connect();
									  
									  if(HttpUrlConnection.getResponseCode()>=400)
									  {
										  System.out.println(url +HttpUrlConnection.getResponseCode()+" broken link"); 
									  }
									  else
									  {
										  System.out.println(url +HttpUrlConnection.getResponseCode()+"accessable link");
									  }
		              }
	}

}
