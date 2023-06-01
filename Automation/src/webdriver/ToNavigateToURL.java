package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
// used to switch one to other url directly 
public class ToNavigateToURL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
    System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.co.in/");
    Thread.sleep(3000);
    
    URL url = new URL("https://www.facebook.com/");
    driver.navigate().to(url);

	}

}
