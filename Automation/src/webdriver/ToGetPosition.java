package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().getPosition();
		
		Point pos = driver.manage().window().getPosition();
		
		System.out.println(pos);
		
		int xCoordinate = pos.getX();
		int yCoordinate = pos.getY();
		
		System.out.println("The X coordinate is: "+xCoordinate);
		System.out.println("The Y coordinate is: "+yCoordinate);
		
	}

}
