package JavaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class instapageprintandsave {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).build().perform();

	

        driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")).click();

	}

}
