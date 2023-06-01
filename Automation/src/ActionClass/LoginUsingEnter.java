package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginUsingEnter {

	public static void main(String[] args) {
		// to overcome the problem webelement login using enter we used three line now in one
		
			 WebDriver driver = new  ChromeDriver();
				
				driver.manage().window().maximize();
				 driver.get("https://demo.actitime.com/login.do");
				   
				   WebElement usernameTextField = driver.findElement(By.id("username"));
				   WebElement passwordTextField = driver.findElement(By.name("pwd"));
				   
			     
			    Actions action = new Actions(driver);
			    action.sendKeys(usernameTextField,"admin").sendKeys(passwordTextField,"manager").sendKeys(Keys.ENTER).perform();
			    
			    
			    

	}

}
