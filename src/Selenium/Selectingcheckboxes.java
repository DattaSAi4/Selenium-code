package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selectingcheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
	        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	              driver = new ChromeDriver();
	       
	        driver.get("https://www.flipkart.com/");
	    WebElement s1 = driver.findElement(By.xpath("//*[@class='Pke_EE']"));
	                s1.sendKeys("iphone");
	                s1.sendKeys(Keys.ENTER);
                 
	        
	       

               WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(1));	       
              
               JavascriptExecutor s3 = (JavascriptExecutor) driver;
   	        s3.executeScript("window.scrollBy(0, 300);");
   	        Thread.sleep(5000);
	          for(int i=1;i<=7;i++)
	          {
	        	 WebElement a1 = driver.findElement(By.xpath("//*[@class=\"SDsN9S\"]//div["+i+"]"));
	        	  if(!a1.isSelected())
	        	  {
	        		  Thread.sleep(10000);
	        		 a1.click(); 
	        		 System.out.println(a1.getText());
	        	  }
	        	 
	          }

	        driver.quit();
	        
	        
	            
	             
	}

}
