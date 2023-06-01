package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifybrowser {
//not running ask with sir pls
	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver = new  ChromeDriver();
	   driver.manage().window().maximize();
	    //navigate to to Url
	   driver.get("https://demo.actitime.com/login.do");
	   //clicking on there login button
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   Thread.sleep(3000);
	   //fetching the error Msg
	   String errorMsg = driver.findElement(By.className("errormsg")).getText();
	   //verifying the error Msg
	   if(errorMsg.contains("Username or Password is invalid. Please try again.")) {
		   System.out.println("Pass:the error msg is verified");
		  
	   }
	   else
		   System.out.println("Fail:the error msg is not verified");
	   //closing the browser
	  
	   driver.quit();
       }

}
