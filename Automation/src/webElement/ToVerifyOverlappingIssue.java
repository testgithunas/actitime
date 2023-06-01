package webElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue {

	public static void main(String[] args) {
	WebDriver driver = new  ChromeDriver();
	
	driver.manage().window().maximize();
    driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
    
	Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
	Rectangle passwordRect = driver.findElement(By.id("prashant")).getRect();
   
	
	int  usernameYcoordinate = usernameRect.getY();
    int  usernameHight = usernameRect.getHeight(); 
    
    int usernameEndY = usernameYcoordinate+usernameHight;
    int  passwordStartY = passwordRect.getY(); 
     
    int space = passwordStartY-usernameEndY;
    System.out.println("the space is : "+space);
     
	}

}
