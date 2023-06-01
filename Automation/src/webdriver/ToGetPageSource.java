package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// navigate to url
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		             String pageSource = driver.getPageSource();
		             if(pageSource.contains("selenium")) { 
		            	 System.out.println("pass:the page contains the information");
		            	
		             }
		             else
		             { 
		            	 System.out.println("fail:the page dosnt conatin information");
		             }

	}

}
