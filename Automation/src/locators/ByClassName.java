package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) {
		
		
	    WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	    driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
	    
	    WebElement header =driver.findElement(By.className("header"));
	    
	     String text=header.getText();
	     System.out.println(text); 
	    

	}

}
