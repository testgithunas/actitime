package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollAndClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //navigate to te url
	   driver.get("https://www.selenium.dev/");
	   driver.findElement(By.linkText("About Selenium")).click();

	}

}
