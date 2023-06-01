package JavaScriptExcecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginThroghJavascript {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		 WebElement usernameTextField = driver.findElement(By.id("username"));
		   
		   
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].value='admin'", usernameTextField);
	 	 WebElement passwordTextField = driver.findElement(By.name("pwd"));
	 	   
	     JavascriptExecutor jp = (JavascriptExecutor)driver;
	     jp.executeScript("arguments[0].value='manager'", passwordTextField);

		
         WebElement disabledButton = driver.findElement(By.xpath("//div[text()='Login ']"));
         JavascriptExecutor jk = (JavascriptExecutor)driver;
         jk.executeScript("arguments[0].click()", disabledButton);


	}

}
