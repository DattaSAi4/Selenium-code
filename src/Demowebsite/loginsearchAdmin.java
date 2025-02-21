package Demowebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginsearchAdmin {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");



		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");

		driver= new ChromeDriver(options);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
		 Thread.sleep(10000);
      
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		
      
       
       //enter username
		username.sendKeys("Admin");
		Thread.sleep(5000);
		//enter password
		driver.findElement(By.xpath("//*[@placeholder='password']")).sendKeys("admin123");

		 //click on submit
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(10000);
		
		//in Dashboad click on admin
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(10000);
		//usernameAdminuser
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Vinay");
		
		 Thread.sleep(10000);
		//select user role
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div/div/div[2]/div/div[2]/div/div/div[2]/i"));
		
		          Select dropdown = new Select(element);
		           dropdown.selectByIndex(2);
		          
		         
		
		      
		
	
	}

}
