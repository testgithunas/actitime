package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathusingveriables {

	public static void main(String[] args) {
		
		String productprice ="₹61,999";
		
		String productName ="APPLE iPhone 13 (Starlight, 128 GB)";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        // Navigate to Flipkart search page for iPhones
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");

        // Find the element that matches the product name and price
	    WebElement price = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[text()='"+productprice+"']"));
        // Get the text content of the matching element
	    String iphoneprice = price.getText();
	    // Print out the iPhone price
	    System.out.println(iphoneprice);
		 }

} 
