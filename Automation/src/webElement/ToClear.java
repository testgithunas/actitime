package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) {
    
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //navigate to te url
	   driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/asd.html");
	   WebElement ATextField = driver.findElement(By.xpath("//input[@value='A']"));
	    
	  
	   ATextField.clear();
	   ATextField.sendKeys("remove ways");
	   
	   


	}

}
