package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pabbineedi.saivinay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");

		   

	}

}
