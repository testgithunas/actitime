package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
		

		public static void main(String[] args) {
	        WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
			driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
			 WebElement plusbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
            Actions action = new Actions(driver);
            //used fr click twio times
            action.doubleClick(plusbutton).perform();
            //click three times
            action.doubleClick(plusbutton).perform();
            
	}

}
