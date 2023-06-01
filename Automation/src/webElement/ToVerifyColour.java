package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyColour {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				String color = driver.findElement(By.name("login")).getCssValue("background-color");
				
				System.out.println(color);

	}

}
