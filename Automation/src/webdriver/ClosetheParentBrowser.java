package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosetheParentBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	
	//launch the browser
	ChromeDriver driver = new ChromeDriver();
	//navigate to the Url
	driver.get("https://demo.actitime.com/login.do");
	//click on the link (no need to understand)
	Thread.sleep(5000);
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	driver.close();
    }
}
