package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyFacebookassertusing {
	@Test
	public void ToVerifygFacebook() {
		 WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.facebook.com/");
		    Assert.assertEquals(driver.getTitle(),"Facebook-log in or sign up");
		     
		}

}
