package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullScreen {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().fullscreen();
		//Thread.sleep(3000);
	}

}
