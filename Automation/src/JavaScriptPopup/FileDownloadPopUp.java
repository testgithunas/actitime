package JavaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopUp {

	public static void main(String[] args) {
		String username="admin";
		String password="admin";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		

	}

}
