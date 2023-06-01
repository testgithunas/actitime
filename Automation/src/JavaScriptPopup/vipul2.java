package JavaScriptPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
		public class vipul2 {

	
		    public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		        driver.get("https://www.facebook.com/");
                //this is use  fr webpage but we have user insterface pop up so use robot class
		        //Actions actions = new Actions(driver);
		        //actions.keyDown(Keys.CONTROL).sendKeys("p").keyUp(Keys.CONTROL).build().perform();
		         Robot robot = new Robot();
		         robot.keyPress(KeyEvent.VK_CONTROL);
		         robot.keyPress(KeyEvent.VK_P);
		         Thread.sleep(5000);
		         
		         robot.keyRelease(KeyEvent.VK_CONTROL);
		         robot.keyRelease(KeyEvent.VK_P);
		         
		         robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
		         
		         Pattern filename = new Pattern("D:\\Automation\\TestData\\snip25may.png");
		         Pattern savebotton= new Pattern("D:\\Automation\\TestData\\save25may.png");
		          
		        Screen screen = new Screen();
		        screen.wait(filename,20);
		        screen.type(filename,"automatinclass1pm24may");
		        screen.click(savebotton);
		        
		            }
		
             }


