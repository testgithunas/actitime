package JavaScriptExcecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		
		
        WebElement NewsHeading= driver.findElement(By.xpath("//h2[text()='News']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //flase use at the same place to verify the button at up
        js.executeScript("arguments[0].scrollIntoView(true)", NewsHeading);



	}

}
