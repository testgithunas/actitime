package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new  ChromeDriver();
	    driver.manage().window().maximize();
	    //naigate to te url
	   driver.get("https://www.flipkart.com/search?q=iphone+14+pro&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_4_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+14+pro%7CMobiles&requestId=b0b8204a-5fcb-4894-a668-0b295f285b47&as-searchtext=ipho");
	   WebElement silverPrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Silver, 128 GB)']/../..//div[text()='₹1,19,999']"));
	    String price = silverPrice.getText();
	    System.out.println(price);
	}

}
