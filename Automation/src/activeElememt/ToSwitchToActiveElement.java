package activeElememt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToActiveElement {

	public static void main(String[] args) {
	    WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	    driver.get("https://www.google.com/");
	    driver.switchTo().activeElement().sendKeys("selenium");

	}

}
