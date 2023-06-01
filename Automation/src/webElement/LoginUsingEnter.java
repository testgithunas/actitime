package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingEnter {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	   driver.get("https://demo.actitime.com/login.do");
	   
	   WebElement usernameTextField = driver.findElement(By.id("username"));
	   WebElement passwordTextField = driver.findElement(By.name("pwd"));
	   
	   usernameTextField.sendKeys("admin");
	   passwordTextField.sendKeys("manager");
	   usernameTextField.sendKeys(Keys.ENTER);
	   
	   
	   
	   
	    
	}

}
