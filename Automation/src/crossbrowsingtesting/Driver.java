package crossbrowsingtesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	public static void main(String[] args) {
		  
		
      CrossBrowserTesting.test(new ChromeDriver());
      System.out.println("the application has been tested on chrome");  
      
      
      		 CrossBrowserTesting.test(new EdgeDriver());
      System.out.println("the application has been tested on chrome");
	

	}

}
