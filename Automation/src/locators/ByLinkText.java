package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) {
		//Launch the browser
      WebDriver driver = new ChromeDriver();
      //Maximize the browser
      driver.manage().window().maximize();
      //Navigate to the url
      driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
      //Locating the link
      
      WebElement link = driver.findElement(By.linkText("Goto selenium"));
      //clicking on the link	
      link.click();
	} 
	

}
