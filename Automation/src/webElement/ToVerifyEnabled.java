package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabled {

	
		public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
		    driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		    Thread.sleep(5000);
		    WebElement emailTextBox = driver.findElement(By.id("email"));
		     
		    emailTextBox.sendKeys("akashdebu@gmail.com");
		    Thread.sleep(2000);
		    WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		    
			boolean enabled= button.isEnabled();
		     if (enabled)
		     {
		    	 button.click();
		    	 System.out.println("the button has been enabled");
		    	
		     }
		     else
		    	 System.out.println("the button has not been enabled");
		

	}

}
