package Hyrtutorial;

import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		
		     System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		     
		     
		                                     
		                 ChromeOptions Option = new ChromeOptions();
		                 
		                 Option.addArguments("--disable-notifications");
		                 
		                 Option.addArguments("start-maximized");
		                 
		              ChromeDriver driver = new ChromeDriver(Option);   
		              
		               driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		               
		               driver.switchTo().frame("frm2");
		               
		              ResourceBundle s1 = ResourceBundle.getBundle("vinay");
		               
		                               String name = s1.getString("Firstname");
		                               
		               
		               
		           WebElement drop = driver.findElement(By.id("selectnav2"));
		           
		                          Select  s4  =  new Select(drop);
		                          
		                      List<WebElement> s9 = s4.getOptions();
		                      
		                      for(WebElement s10:s9)
		                      {
		                    	  System.out.println("The dropdown options In frame 2: "+s10.getText());
		                      }
		                      
		                      driver.findElement(By.id("firstName")).sendKeys("Datta Sai Vinay");
		                   //   driver.findElement(By.id("firstName")).sendKeys("DattaSaiVinay");
		                      
		                      driver.findElement(By.id("lastName")).sendKeys("Pabbineedi");
		                      
		                      driver.findElement(By.id("femalerb")).click();
		                      
		                      driver.findElement(By.id("englishchbx")).click();
		                      
		                      driver.findElement(By.id("email")).sendKeys("psaivinya123@gmail.com");
		                      
		                      driver.findElement(By.id("password")).sendKeys("DattaSai2");
		                      
		                      Thread.sleep(20000);
		                      
		                      driver.quit();
		                      
		             
		                                      
	}
}
