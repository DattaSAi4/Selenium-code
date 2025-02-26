package Hyrtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./driver/chrome.driver");
		
		              
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div/input[1]")).sendKeys("Datta Sai Vinay");

	    driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div/input[2]")).sendKeys("Pabbineedi");
	    
	    driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div/input[3]")).sendKeys("psaivinay123@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[2]/input")).sendKeys("DattaSai2");
	    
	    driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div/input[4]")).sendKeys("DattaSai2");
	    
	    driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[3]/button")).click();
	    
	    Thread.sleep(10000);
	    
	    driver.close();
	    
	    
	}

}
