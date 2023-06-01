package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlignmentIssue {

	//public static void main(String[] args) {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new  ChromeDriver();
		    driver.manage().window().maximize();
		   driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
		   Point usernamelocation = driver.findElement(By.id("123")).getLocation();
		   Point passwordlocation = driver.findElement(By.id("prashant")).getLocation();
		   
		   System.out.println(usernamelocation);
		   
		   System.out.println(passwordlocation);
		   
		   int usernameXCoordinate=usernamelocation.getX();
		   int passwordXCoordinate=passwordlocation.getX();
		   
		   if(usernameXCoordinate==passwordXCoordinate) {
			   System.out.println("pass: the allignmengt is proper");
			      
			    }
		   else
			   System.out.println("fail:the allignment is not proper");
		   driver.quit();
	}

}
