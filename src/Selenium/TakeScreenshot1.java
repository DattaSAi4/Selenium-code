package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot1 {
	
	
	static WebDriver Driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver w1 = new ChromeDriver();
		
		w1.get("https://www.google.co.in/");
		
		     TakesScreenshot s1 =  (TakesScreenshot)Driver;
		     File s3 = s1.getScreenshotAs(OutputType.FILE);
		     
		  File s4 = new File("./Screenshot/image.png");
		  s4.createNewFile();
		  try {
			  FileUtils.copyFile(s3, s4);
		  }
		  catch(IOException e)
		  {
		     e.printStackTrace();
		  }
		                    
		     
		     
	}

}
