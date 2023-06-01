package DropandDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NoselectTag {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/select-menu");
			WebElement Dropdown = driver.findElement(By.xpath("//div[text()='Select Option']"));
			Actions action =new Actions(driver);
			action.sendKeys(Dropdown,"A root").sendKeys(Keys.ENTER).perform();

	}

}
