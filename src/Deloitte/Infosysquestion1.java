//2. Type username incorrectUser into Username field
//3. Type password Password123 into Password field
//4. Push Submit button
//5. Verify error message is displayed
//6. Verify error message text is Your username is invalid! Cod in Java




package Deloitte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Infosysquestion1 {
	
	public static void main(String[] args) {
		
		 System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		 
         ChromeDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
        
         try
         {
        	        driver.get("https://practicetestautomation.com/practice-test-login/");
        	        
        	        WebElement username = driver.findElement(By.id("username"));
        	                          
        	        username.sendKeys("stunt");
        	       
        	       driver.findElement(By.id("password")).sendKeys("Password123");
        	       
        	       driver.findElement(By.id("submit")).click();
        	       
        	      WebElement erro = driver.findElement(By.id("error"));
        	      
        	       System.out.println(erro.getText());
        	       
        	       if(!erro.getText().equalsIgnoreCase("Your username is invalid!"))
        	       {
        	    	   throw new AssertionError("The error message is different from expected");
        	       }
        	       else
        	       {
        	    	   System.out.println("The error message is disaplying a proper way ");
        	       }
        	       
        	       
        	                           
         }
         catch(Exception e)
         {
        	 System.out.println(e.getMessage());
         }
         finally
         {
        	 driver.close();
         }
	}

}
