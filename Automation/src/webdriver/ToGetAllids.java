package webdriver;

import org.openqa.selenium.WindowType;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllids { 
	 public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.co.in/");
		 //the newwindow is not in this vrsn put logic instrad of this
		 
		 // switch to is use to get new page to open new url 
		 driver.switchTo().newWindow(WindowType.TAB);
		   
		 driver.navigate().to("https://www.facebook.co.in/");
			
			Set<String> allIDs= driver.getWindowHandles();
			 System.out.println(allIDs);
			
		 
		
	}
	

}
