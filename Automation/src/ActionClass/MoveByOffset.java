package ActionClass;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) {
		
			 WebDriver driver = new  ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.get("https://www.myntra.com/");
			     
			     
			     
			    Actions action = new Actions(driver);
			   action.moveByOffset(1440, 42).click().perform();
			    

	}

}
