package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosetheParentChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//navigate to the url
		driver.get("https://demo.actitime.com/login.do");
		//click on the link (no need to understand)
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
