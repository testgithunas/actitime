package DropandDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelecta {

	public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoqa.com/select-menu");
			WebElement carDropdown = driver.findElement(By.id("cars"));
			Select select= new Select(carDropdown);
			boolean multiselect = select.isMultiple();
			if(multiselect) {
				System.out.println("pass: the dropdown is multiselect");
			}
			else
				System.out.println("fail: the dropdown is singleselect");


	}

}
