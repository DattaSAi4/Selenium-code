package Demowebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver;
		
		          ChromeOptions options = new ChromeOptions();
		          
		           options.addArguments("--start-maximized");
		           
		           driver =new ChromeDriver(options);
		           
		           driver.get("https://demoqa.com/elements");
		           
		           //click on check box
		           driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
		           
		           Thread.sleep(10000);
		           
		            driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-expand-close\" ]")).click();
		        	  
		                         
		            driver.findElement(By.xpath("//*[@id=\"tree-node-desktop\"]/parent::label")).click();
		                         driver.close();
//		       
	}

}
