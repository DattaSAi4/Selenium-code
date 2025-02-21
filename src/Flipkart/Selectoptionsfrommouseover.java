package Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectoptionsfrommouseover {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/communication-preferences/push?t=all");
        
            Actions s1 = new Actions(driver);
            
                 WebElement s11 = driver.findElement(By.xpath("//*[@class=\"_3ZeUN+\"]"));
                 
                 s1.moveToElement(s11).build().perform();
                 
                 Thread.sleep(10000);
                 List<WebElement> s4 = driver.findElements(By.xpath("s+8PCn intRxj_9zHVSK _5XbPZt eTQwh+"));
               
               for(  WebElement s9:s4)
               {
            	   System.out.println(s9.getText());
               }
	}

}
