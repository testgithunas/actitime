package JavaScriptPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toclosechildbroeswerpopup {

	
//this is how i handle child browser popup and closed it
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 String parentID = driver.getWindowHandle();
		 //click on the link to open child window
		 driver.findElement(By.linkText("actiTIME Inc.")).click();
		 
	     Set<String> allIDSs = driver.getWindowHandles();
	     
            // Get all window handles and close all child windows
	        //if not defined ask for local variable
		 for(String id:allIDSs) {
			//create object
			 driver.switchTo().window(id);
			 if(!id.equals(parentID)) {
				 Thread.sleep(5000);
				 driver.close();
			 }
			
		}
		    // Switch back to the parent window
	        driver.switchTo().window(parentID);

	        // Close the parent window after 5 seconds
	        Thread.sleep(5000);
	        driver.quit(); 
		

	}

}


