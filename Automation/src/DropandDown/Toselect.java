package DropandDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toselect {

	
		public static void main(String[] args) {
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//navigate to the URL
			driver.get("https://www.facebook.com/");
			//clicking create new account button
	        driver.findElement(By.linkText("Create new account")).click();
	        //Identifying the day dropdown
	        WebElement dayDropdown = driver.findElement(By.id("day"));
	        
	       Select select =new Select(dayDropdown);
	       //selecting the index 9 i.e. 10 from the dropdown
	         select.selectByIndex(9);
	       //identifying the month dropdown
	         WebElement monthDropdown = driver.findElement(By.id("month"));
	     
	           Select select1 = new Select(monthDropdown);
	           //selecting october from the dropdown
	           select1.selectByVisibleText("Oct");
	           //identifying the year dropdown
	          WebElement yearDropdown = driver.findElement(By.id("year"));
	           Select select2 =  new Select(yearDropdown);
	           //Seleting 1998 from the dropdown 
	           select2.selectByVisibleText("1998");
		

	}

}
