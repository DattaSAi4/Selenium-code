package Demowebsite;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassandmethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "./Driver/chromedriver.exe");



		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");

		driver= new ChromeDriver(options);
		
		driver.get("https://artoftesting.com/samplesiteforselenium?form=MG0AV3");
		
		driver.findElement(By.id("fname")).sendKeys("Testing");
		
		
		
	              WebElement click = driver.findElement(By.id("idOfButton"));
	              
	              //doubleclick
	              System.out.println("********doubleclick***********");
	             WebElement doubleclick = driver.findElement(By.id("dblClkBtn"));
		
	     
		              Actions action = new Actions(driver);
		              
		              Thread.sleep(20000);
		              action.click(click).build().perform();
		              
		              action.doubleClick(doubleclick).build().perform();
		              
		                  //Alerts  
		              System.out.println("********Alerts***********");
		            Alert s1 = driver.switchTo().alert();
		            
		                 System.out.println(s1.getText()); 
		                            
		                    
		                s1.accept();
		                
		                
		                Thread.sleep(10000);
		              //Radiobutton
		                System.out.println("********RadioButton***********");    
		              WebElement male = driver.findElement(By.id("male"));
		                male.click();
		                
		                 if(male.isSelected())
		                 {
		                	 System.out.println("Male radiobutton selected successfully");
		                 }
		                 else
		                 {
		                	 System.out.println("radiobutton not selected properly ");
		                 }
		                 
		                 Thread.sleep(10000);
		                 
		                 //Checkbox
		                 System.out.println("********checkbox***********");
		              WebElement checkbox = driver.findElement(By.className("Performance"));
		              
		              checkbox.click();
		              
		              if(checkbox.isSelected())
		              {
		            	  System.out.println("Successfully  permoformes checkbox selected");
		              }
		              else
		              {
		            	  System.out.println(" checkbox not selected properly ");
		              }
		              
		              
		              Thread.sleep(10000);
		         //Dropdown
		              System.out.println("********dorpdown***********");    
		       WebElement dropdown = driver.findElement(By.id("testingDropdown"));
		       
		                    Select select = new Select(dropdown);
		                    
		                 List<WebElement> options1 = select.getOptions();
		                 
		                          for(WebElement s3:options1)
		                          {
		                        	  System.out.println(s3.getText());
		                          }
		                          select.selectByIndex(2);
		                          
		        //Alerts
		               System.out.println("********Alerts(simple)_***********");
		                          //simple alert
		               driver.findElement(By.xpath("//button[text()=\"Generate Alert Box\"]")).click();
		               
		             Alert alert = driver.switchTo().alert();
		             
		                          System.out.println(alert.getText());
		                 
		                          alert.accept(); 
		                          
		                  //comfirmation alert
		                          System.out.println("********Alerts(Confirmation Alert)_***********");   
		              driver.findElement(By.xpath("//button[text()=\"Generate Confirm Box\"]")) .click();
		              
		              System.out.println(alert.getText());
		              
		              alert.accept();//or alert.dismiss();
		              
		              
		              Thread.sleep(10000);
		              
		              //drop and drag 
		              
		   WebElement source = driver.findElement(By.xpath("//img[@alt=\"art of testing\"]"));
		                WebElement target = driver.findElement(By.id("targetDiv"));
		              
		                Actions ad = new Actions(driver);
		                
		                ad.dragAndDrop(source, target).build().perform();
		                
		                Thread.sleep(10000);
		                
		                driver.close();
		                
		                
		               
		              
		             
		            
		              
		              
		              
	}

}
