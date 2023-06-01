package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToVerifyGoogle {
	@Test
	public void ToVerifygoogle() {
		 WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.google.com/");
		     
		    if (driver.getTitle().equals("Google")) {
		    System.out.println("Pass: the title is verified");
	         }
		    else
	
		System.out.println("fail:the title is not verified");
		    
	}
}
