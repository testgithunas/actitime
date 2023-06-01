package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateSubUrl {

	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		  URL subURL = new URL("https://www.oracle.com/");
		driver.navigate().to(subURL);
		
	}

}
