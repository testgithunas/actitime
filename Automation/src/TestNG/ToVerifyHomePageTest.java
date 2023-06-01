package TestNG;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyHomePageTest extends BaseClass{
	@Test
	public  void ToVerifyHomePageTest(){
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	String homepageTitle =driver.getTitle();
	
	Assert.assertTrue(homepageTitle.contains("Enter"));
	System.out.println("Pass:the homepage has been verified");
	
	
	
	
	}
}