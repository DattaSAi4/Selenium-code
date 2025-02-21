package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginandsearchtheproduct {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
            driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
            
              driver.findElement(By.xpath("//*[contains(text(),\"Login\")]")).click();
              Thread.sleep(4000);
              driver.findElement(By.xpath("//*[@class=\"r4vIwl BV+Dqf\"]")).sendKeys("9569679999");
              driver.findElement(By.xpath("//*[contains(text(),\"Request OTP\")]")).click();
              Thread.sleep(10000);
             
              
	}

}
