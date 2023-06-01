package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementByaxis {

	public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // to give the rating we need yo move the cursor to give the rating actully 
		driver.get("https://amp.dev/documentation/examples/websites/interactivity-dynamic-content/star_rating/?redirected");
		
		 WebElement rating1 = driver.findElement(By.id("rating1"));
		
		Actions action = new Actions(driver);
		action.moveToElement(rating1,100,0).perform();
	

	}

}
