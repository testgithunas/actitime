package JavaScriptPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) throws FindFailed, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gad=1&gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW9bSQvieTKHx3M-AWJ1bBblDfikHOhE0jIm3ZZ8MZupTgYmLycjBNsaAigNEALw_wcB&gclsrc=aw.ds");
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        Pattern filename = new Pattern("D:\\Automation\\TestData\\snippingtool.png");
        new Pattern("D:\\Automation\\TestData\\openbuttonsiguli.png");
        Screen screen = new Screen();
        screen.wait(filename,20);
        screen.type(filename,"D:\\Automation\\TestData\\abcsikuli.docx");
        
        new Robot().keyPress(KeyEvent.VK_ENTER);
        
        
        
	}

}
