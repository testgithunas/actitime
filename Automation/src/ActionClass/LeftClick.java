package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
		    driver.get("https://demo.actitime.com/login.do");
		     
		     WebElement cheakbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		     
		    Actions action = new Actions(driver);
		    action.click(cheakbox).perform();
		    
	}
		    
}

