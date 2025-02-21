package Demowebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddAdmindetaills {
	
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
			Thread.sleep(10000);
			//enter password
			driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");

			 //click on submit
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(10000);
			
			//in Dashboad click on admin
			driver.findElement(By.xpath("//*[text()='Admin']")).click();
			
			
			Thread.sleep(10000);
			
			//click on Add
			driver.findElement(By.xpath("//*[text()=' Add ' ]")).click();
			
			driver.close();
			
			
	}

}
