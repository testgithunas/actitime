package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheToolTipText {

	public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	
		String tooltipText = checkbox.getAttribute("title");
		
		System.out.println("The tool tip text is :"+tooltipText);
		
		if(tooltipText.contains("Do not select")) {
			
			System.out.println("pass:the tool tip text has been verified");
		}
		
		else
			System.out.println("pass:the tool tip text has not been verified");

	}

}

