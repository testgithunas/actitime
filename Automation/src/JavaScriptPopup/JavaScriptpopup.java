package JavaScriptPopup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptpopup {

	
		public static void main(String[] args) throws InterruptedException  {
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();


	}

}
