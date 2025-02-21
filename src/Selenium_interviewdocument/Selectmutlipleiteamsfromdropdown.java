package Selenium_interviewdocument;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmutlipleiteamsfromdropdown {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pabbineedi.saivinay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		        
		       driver.get("https://www.saucedemo.com/");
		       driver.findElement(By.id("user-name")).sendKeys("standard_user");
		       driver.findElement(By.id("password")).sendKeys("secret_sauce");
		       driver.findElement(By.id("login-button")).click();
		       
		      WebElement s1 = driver.findElement(By.className("product_sort_container"));
		      
		     Select s2 = new Select(s1);
		    // s2.selectByIndex(2);
		     
		  List<WebElement> s3 = s2.getOptions();
		  
		  for( WebElement s4:s3)
		  {
			  System.out.println(s4.getText());
		  }
	}

}
