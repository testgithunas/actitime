package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifytheurl{
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.selenium.dev/downloads/");
		//to get the url of the current web page
		String url=driver.getCurrentUrl();
		System.out.println();
		if(url.contains("selenium")) { 
	    System.out.println("Pass:the url is verified");
		}
		else 
		System.out.println("Fail:the url is ot verified");	
	}

}
