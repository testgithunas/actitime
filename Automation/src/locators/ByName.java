package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new  ChromeDriver();
    driver.manage().window().maximize();
    //naigate to te url
    driver.get("file:///C:/Users/PRASHANT%20KUMAR/Desktop/selenium.html");
    //identify uaer anme text field
     WebElement usernameTextfield =driver.findElement(By.id("123"));
     System.out.println(usernameTextfield);
     //passing teh vakue in username textfield
     usernameTextfield.sendKeys("Baba Ramdev"); 
    //identify password text field
     WebElement passwordTextfield =driver.findElement(By.id("prashant"));
     //passing the value in password text field
     passwordTextfield.sendKeys("qwerty is password");
     
	}

}
