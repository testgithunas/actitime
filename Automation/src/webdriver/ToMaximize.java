package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		//minimize method only present in 4 version of selenium
	}

}
