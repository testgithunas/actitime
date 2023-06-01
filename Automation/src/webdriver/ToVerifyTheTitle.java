package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String titleofFacebook=driver.getTitle();
        System.out.println(titleofFacebook);
        if(titleofFacebook.contains("Facebook")) {
        	System.out.println("pass:the system is verified");
        }
        else
        	System.out.println("Fail: The system is not verified");
			
		}
	}
	

