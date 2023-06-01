package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		// launch 1
		ChromeDriver driver1 = new ChromeDriver();
		
		String windowID1= driver1.getWindowHandle();
		
		System.out.println(windowID1);
		//launch 
		ChromeDriver driver2 = new ChromeDriver();
		
		String windowID2= driver2.getWindowHandle();
		
		System.out.println(windowID2);
		
	}

}
