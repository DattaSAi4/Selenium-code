package Deloitte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Takeascreenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		               
		ChromeOptions options = new ChromeOptions();
		           
		             options.addArguments("--start-maximized");
		
		       driver = new ChromeDriver(options);
		       
		       driver.get("https://www.bing.com/search?pglt=43&q=google&cvid=f212db83afa6427696b2f30f574f751c&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIGCAEQABhAMgYIAhAuGEAyBggDEC4YQDIGCAQQLhhAMgYIBRAuGEAyBggGEC4YQDIGCAcQBRhAMgYICBBFGDwyCAgJEOkHGPxV0gEIMTIzOWowajGoAgCwAgE&FORM=ANNAB1&PC=U531");
		                              
		          File d1 =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		          
		                     FileUtils.copyFile(d1, new File("./target/preeti.png"));
		                                
		        
	}

}
