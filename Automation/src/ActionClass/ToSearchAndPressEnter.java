package ActionClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSearchAndPressEnter{

			public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://www.google.co.in/");
				WebElement textField = driver.findElement(By.name("q"));
				Actions action = new Actions(driver);
				action.sendKeys(textField, "shinchan").sendKeys(Keys.ENTER).perform();


	}

}
