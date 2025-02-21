package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchbetweenmultiplewindows {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pabbineedi.saivinay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
	    driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	    driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	     
	    ArrayList<String> s1 = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(s1.get(1));
	   String url= driver.getCurrentUrl();
	   System.out.println(url);
	    
	}

}
