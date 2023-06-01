package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	 public homepage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	
}
     @FindBy(linkText="Logout")
     public WebElement logoutButton;
     
     public void logoutAction() {
    	 logoutButton.click();
	}

}
