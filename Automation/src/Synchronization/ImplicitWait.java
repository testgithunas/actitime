package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

		public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		    
		    WebElement emailTextBox = driver.findElement(By.id("email"));
		     
		    emailTextBox.sendKeys("akashdebu@gmail.com");
		    
		    
	}

}
