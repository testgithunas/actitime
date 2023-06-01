package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNevigateBrowserHistory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.facebook.com/");
	    driver.navigate().back();
	    //back and forward are use like googleto facebook direct url page
	    driver.navigate().forward();
	    driver.navigate().refresh();
		
	}

    }
