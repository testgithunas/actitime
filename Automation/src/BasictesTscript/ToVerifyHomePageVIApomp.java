package BasictesTscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.LoginPage;
import POMRepo.homepage;

public class ToVerifyHomePageVIApomp {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
//		
//		 LoginPage login = new LoginPage(driver);
//		 login.usernametextfield.sendKeys("admin");
//		 
//		 driver.navigate().refresh();
//		 
//		 login.usernametextfield.sendKeys("trainee");
//		 
//		 
		 LoginPage login = new LoginPage(driver);
     	 login.loginAction("admin","manager");
     	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String homepagetitle = driver.getTitle();
		if(homepagetitle.contains("Enter")) {
			System.out.println("pass:the title has been verified");
		}
		else
			System.out.println("fail:the title has been verified");
		 
		homepage home = new homepage(driver);
		home.logoutAction();
		
		driver.quit();
     	 
		 
	}

}
