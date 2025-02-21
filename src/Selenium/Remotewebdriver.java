package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remotewebdriver {
	
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");					
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
	//	options.addArguments("--incognito");
		System.out.println("Chrome Browser started to launch......");
		remoteWebDriver.set(new ChromeDriver(options));
		
	}

}
