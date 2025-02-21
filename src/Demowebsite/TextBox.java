package Demowebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		    
		
		
		        ChromeOptions options = new ChromeOptions();
		        
		        options.addArguments("--start-maximized");
		        options.addArguments("--disable-notifications");
		        
		        driver= new ChromeDriver(options);
		        
		        driver.get("https://demoqa.com/elements");
		        
		        driver.findElement(By.xpath("//*[contains(text(),'Text Box')]")).click();
		        
		        
		        
		          
		        Thread.sleep(5000);
		        
		        //Fill the form
		        
		        //fullname
		        driver.findElement(By.id("userName")).sendKeys("Datta Sai Vinay");
		        
		        //email
		        driver.findElement(By.id("userEmail")).sendKeys("psaivinay123@gmail.com");
		        
		        // temporary adress
		        driver.findElement(By.id("currentAddress")).sendKeys("1-72,kakinada,eastgodavari pincode=533468");
		        
		        //permanat address
		        driver.findElement(By.id("permanentAddress")).sendKeys("bangalore,kengeri,pincode-560069");
		        
		        //scrolldown
		        Thread.sleep(10000);
		        JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
		        scrolldown.executeScript("window.scrollBy(0, 5000)");
		        
		        //submit
		        driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
		        
		        //sleep
		        Thread.sleep(10000);
		       
		        //close the browser
		        driver.close();
		        
		        
		
		
	}

}
