package JavaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup { 
	
	public static void main(String[] args) {
		
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://www.flipkart.com/");
		        driver.findElement(By.xpath("//button[text()='✕']")).click();
		        

  }
}