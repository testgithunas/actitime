package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	   driver.get("https://www.selenium.dev/downloads/");
	    
	    WebElement link = driver.findElement(By.xpath("//span[text()='Downloads']"));
	    link.click();
	    
	    
	    
	}

}
