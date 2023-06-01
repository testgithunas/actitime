package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVErifyDimesionPassOrFail {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
			   
			 
	    WebElement usernameTextField = driver.findElement(By.id("username"));
	    WebElement passwordTextField = driver.findElement(By.name("pwd"));
	    Dimension usernameDimension= usernameTextField.getSize();
		Dimension passwordDimension=passwordTextField.getSize();
		
		int usernameHight=usernameDimension.getHeight();
		int usernameWidth=usernameDimension.getWidth();
			 
		System.out.println("the width of username test field  is :"+usernameWidth);
		System.out.println("the width of username test field  is :"+usernameHight);
		
		int passwordHight=passwordDimension.getHeight();
		int passwordWidth=passwordDimension.getWidth();
			 
		System.out.println("the width of password test field  is :"+passwordWidth);
		System.out.println("the width of password test field  is :"+passwordHight);
	 
		if(usernameHight==passwordHight && usernameWidth == passwordWidth) {
			System.out.println("pass:the Dimension has been verified");
		}
		else
		System.out.println("fail:the Dimension has not been verified");
		driver.quit();

	}

}
