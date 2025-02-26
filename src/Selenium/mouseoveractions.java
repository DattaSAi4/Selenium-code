//mouseroveraction 1.click 2.doubleclick 3.contextclick 4.draganddrop 5.movetoelemene
package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveractions {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/selectable");
		    Actions action = new Actions(driver);
		     
		     
//		    //click
//		  WebElement element = driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li[1]"));
//		    action.click(element).build().perform();
//		    
//		    //double click 
//		    action.doubleClick(element).build().perform();

		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0, 500)");
		    //draganddrop
		   WebElement driver1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[4]/span"));
		   js.executeScript("arguments[0].scrollIntoView(true);", driver1);
		   driver1.click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   WebElement sourceelement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]"));
	       WebElement targetelement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]"));
		   action.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();
	       
	}

}
