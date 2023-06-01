package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMRepo.LoginPage;
import POMRepo.homepage;

public class TestByAnnotaionLogin {
	public WebDriver driver; 
	@BeforeSuite
	public void bs() {
		System.out.println("data base connection has been stablished");
	}
	
	@BeforeClass
	public void bc() {
	    driver =new ChromeDriver();
	
	    System.out.println("the browser has been launced");
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
	
		System.out.println("the url has been naviagted");
	}
	
	@BeforeMethod
	public void bm() {
		 LoginPage login = new LoginPage(driver);
     	 login.loginAction("admin","manager");
		System.out.println("logged in to the application");
	}
	
	@AfterMethod
	public void am() {
		homepage home = new homepage(driver);
		home.logoutAction();

		System.out.println("logged out to the application");
	}
	
	@AfterClass
		public void ac() {
		driver.quit();
		
		System.out.println("browser closed");
	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("the data base connection has been closed");
	}

}
