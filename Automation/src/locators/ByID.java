package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new  ChromeDriver();
    driver.manage().window().maximize();
    //naigate to te url
    driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
    
    WebElement usernameTextfield =driver.findElement(By.id("123"));
     System.out.println(usernameTextfield);
     usernameTextfield.sendKeys("Baba Ramdev"); 
    
     
     
	}

}
