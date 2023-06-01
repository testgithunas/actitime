package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void bs() {
	
		System.out.println("data base connection has been stablished");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("the browser has been launced");
		System.out.println("the url has been naviagted");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("logged in");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("logged out to the application");
	}
	
	@AfterClass
		public void ac() {
		
		System.out.println("browser closed");
	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("the data base connection has been closed");
	}
	
	
	}
