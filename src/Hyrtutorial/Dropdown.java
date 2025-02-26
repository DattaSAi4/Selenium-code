package Hyrtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		               ChromeDriver d1 = new ChromeDriver();
		               
		               d1.manage().window().maximize();
		               
		               d1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		               
		             WebElement dropdown = d1.findElement(By.id("course"));
		             
		              Select w1 = new Select(dropdown);
		              
		                      w1.selectByIndex(1);
		                      
		              List<WebElement> w2 = w1.getOptions();
		              
		              for(WebElement e2:w2)
		              {
		            	  System.out.println(e2);
		              }
		              
		             WebElement s5 = d1.findElement(By.id("ide"));
		             
		                      Select e1 = new Select(s5);
		                      
		                      e1.selectByIndex(1);
		             
		                   
		               
	}

}
