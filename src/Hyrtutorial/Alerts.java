package Hyrtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		                  ChromeDriver driver = new ChromeDriver();
		                  
		                  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		                  
		                  
		                  driver.findElement(By.id("alertBox")).click();
		                  
		                  
		                  
		                  driver.switchTo().alert().accept();
		                  
		                  Thread.sleep(10000);
		                  
		                  driver.findElement(By.id("confirmBox")).click();
		                  
		                
		                  
		                  driver.switchTo().alert().dismiss();
		                  
		                  Thread.sleep(10000);
		                  
		                WebElement s9 = driver.findElement(By.id("promptBox"));
		                 
		                                 s9.click();
		                                 
		                                
		                                 
		                      driver.switchTo().alert().sendKeys("Datta SAi Vinay");
		                      
		                      driver.switchTo().alert().accept();
		                  
		                  Thread.sleep(10000);
		                  
		                  
		                              
		                
	}

}
