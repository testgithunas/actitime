package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimension {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension dimension = driver.manage().window().getSize();
		System.out.println(dimension);
		int width = dimension.getWidth();
		int height = dimension.getHeight();
		System.out.println("The width is: "+width);
		System.out.println("The height is: "+height );
	}

}
