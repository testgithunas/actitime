package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTagName {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

	      WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
	
			driver.get("https://www.google.com/search?q=selenium&source=lnms&tbm=isch&sa=X&ved=-AhVhiVYBHQikBkYQ_AUoAXoECAIQAw&biw=1366&bih=612");
			
			WebElement secondImageofselenium = driver.findElement(By.xpath("(//img[@class=\"rg_i Q4LuWd\"])[2]"));
			
			String altTextofImage = secondImageofselenium.getAttribute("alt");
			
			if(altTextofImage.contains("Selenium")){
				
				System.out.println("pass:the alt text has been verified");
			}
			else
				System.out.println("pass:the alt text has been verified");
			
			
		

	}

}
