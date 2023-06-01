package autosuggestion5may;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllsuggestions {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new  ChromeDriver();
		    driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   driver.findElement(By.name("q")).sendKeys("selenium");
		   
		   Thread.sleep(2000);
		  List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
          int noofSuggestions=allSuggestions.size();
          System.out.println("the no of suiggestion are:"+noofSuggestions);
          for(WebElement suggestions:allSuggestions) { 
        	  System.out.println(suggestions.getText());
          }
	}

}

