package crossbrowsingtesting;

import org.openqa.selenium.WebDriver;

public class CrossBrowserTesting {

	public static void test(WebDriver driver) {
		
    driver.get("https://www.google.co.in/");
     
    String title= driver.getTitle();
     if(title.contains("Google")) { 
    	 System.out.println("pass: the title is verified");
    	 
     }
    	
     else
    	 System.out.println("fail:the title is not varified");
       
     
     driver.quit();
	

	}

}
