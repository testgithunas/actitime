package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheakDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   
	 WebElement usernameTextField = driver.findElement(By.id("username"));
	 WebElement passwordTextField = driver.findElement(By.name("pwd"));
	 
	Dimension usernameDimension= usernameTextField.getSize();
    Dimension passwordDimension=passwordTextField.getSize();
	 
    System.out.println(usernameDimension);
	System.out.println(passwordDimension);

	}

}
