package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoulteXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	    driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/asd.html");
	    
	    WebElement aTextfield = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
	    
	   
		aTextfield.sendKeys("  how r u");
	    
	    

	}

}
