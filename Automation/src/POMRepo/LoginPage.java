package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
		}
	@FindBy(id="username")
	public WebElement usernametextfield;
	
	@FindBy(name="pwd")
	public WebElement passwordtextfield;
	
	@FindBy(xpath="//div[text()=\"Login \" ]")
	public WebElement loginButton;
	
	public  void loginAction(String username ,String password) {
		usernametextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		loginButton.click();
	}

}
