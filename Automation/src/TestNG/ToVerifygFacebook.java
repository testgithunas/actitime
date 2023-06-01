package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//@test annotated class
public class ToVerifygFacebook {
	//@test annotated method
	@Test
	public void ToVerifygFacebook() {
		 WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.facebook.com/");
		     
		    if (driver.getTitle().contains("Facebook")) {
		    System.out.println("Pass: the title is verified");
	         }
		    else
	
		System.out.println("fail:the title is not verified");
		    
	}
}
	


