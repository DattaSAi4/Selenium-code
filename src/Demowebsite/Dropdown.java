package Demowebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		               ChromeOptions options = new ChromeOptions();
		               
		               options.addArguments("--Start-Maximized");
		               
		             ChromeDriver driver = new ChromeDriver(options);
		             
		             driver.get("https://practice.expandtesting.com/dropdown?form=MG0AV3");
		             
		            WebElement d3= driver.findElement(By.id("dropdown"));
		                    
		            Select s2 = new Select(d3);
		             
	                           List<WebElement> s4 = s2.getOptions();
	                           
	                           for(WebElement s9:s4)
	                           {
	                        	  System.out.println(s9.getText()); 
	                           }
	                           driver.close();
		                
		                
	}

}
