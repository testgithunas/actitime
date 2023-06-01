package ActionClass;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMYSElf {

	
		public static void main(String[] args) throws InterruptedException {
			 WebDriver driver = new  ChromeDriver();
				
				driver.manage().window().maximize();
			    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			     
			     WebElement cheakbox = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
			     
			    Actions action = new Actions(driver);
			   action.contextClick(cheakbox).perform();
			    

	}

}
