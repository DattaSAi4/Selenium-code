//Positive Login test
//1 ﻿﻿﻿Type username student into Username field
//2 ﻿﻿﻿Type password Password 123 into Password field
//3 ﻿﻿﻿Push Submit button
//4 ﻿﻿﻿Verify new page URL contains practicetestautomation.com/logged-in-
//successfully/
//5 ﻿﻿﻿Verify new page contains expected text ('Congratulations' or 'successfully logged in')
//6 ﻿﻿﻿Verify button Log out is displayed on the new page


package Deloitte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Infosysquestion {
	
	public static void main(String[] args) {
		
		 System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
		 
		           ChromeDriver driver = new ChromeDriver();
		           
		           try {
		        	      driver.get("https://practicetestautomation.com/practice-test-login/");
		        	      
		        	      driver.findElement(By.id("username")).sendKeys("student");
		        	      
		        	      driver.findElement(By.id("password")).sendKeys("Password123");
		        	      
		        	      driver.findElement(By.id("submit")).click();
		        	      
		        	        String expectedurl= driver.getCurrentUrl();
		        	        
		        	        String actualurl="https://practicetestautomation.com/logged-in-successfully/";
		        	        
		        	      if(!expectedurl.equalsIgnoreCase(actualurl))
		        	      {
		        	    	  throw new AssertionError("url Verification fail");
		        	      }
		        	      else
		        	      {
		        	    	  System.out.println("Url verification is succesfull ");
		        	      }
		        	      
		        	      if(!driver.getPageSource().contains("Logged In Successfully"))
		        	      {
		        	    	   throw new AssertionError("The containes test is not present in the homepage");
		        	      }
		        	      else
		        	      {
		        	    	  System.out.println("The test is present in the homepage ");
		        	      }
		        	      
		        	     WebElement logout = driver.findElement(By.xpath("//*[text() = \"Log out\"]"));
		        	     
		        	     if(!logout.isDisplayed())
		        	     {
		        	    	 throw  new AssertionError("The logout button is not displayed");
		        	     }
		        	     else
		        	     {
		        	    	System.out.println("The logout button is displayed");
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
