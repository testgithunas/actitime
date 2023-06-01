package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	      //Maximize the browser
	      driver.manage().window().maximize();
	      //Navigate to the url
	      driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
	      //Locating the link
	      //if not use bigbracket invalidselectorexceptio
	      //if cheakboxy write than No such elementexception
	      WebElement cheakbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
	      //clicking on the link	
	      cheakbox.click();
	      Thread.sleep(3000);
	      cheakbox.click();
	      

	}

}
