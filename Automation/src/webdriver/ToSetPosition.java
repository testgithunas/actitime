package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubdriver.get("https://www.selenium.dev/downloads/");
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(3000);
	    Point pos = new Point (100,100);
		
	
		//Point newPos = null;
		driver.manage().window().setPosition(pos);
		
		System.out.println(pos);
		

	}

}
