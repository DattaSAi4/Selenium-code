package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pabbineedi.saivinay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> s1 = driver.getWindowHandles();

		for(String windows:s1)
		{

			if(!parentwindow.equals(windows))
			{
				driver.switchTo().window(windows);
				System.out.println(driver.getCurrentUrl());
		
			}

		}
		String s2 =   driver.switchTo().window(parentwindow).getCurrentUrl();
		System.out.println(s2);
	}

}
