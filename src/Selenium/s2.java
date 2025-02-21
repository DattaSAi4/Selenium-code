package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.net.http.common.Utils;

public class s2 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        File s3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                   
                 File s1 = new File("./driver/sai.png");
                 
                FileUtils.copyFile(s3, s1);
	}

}
