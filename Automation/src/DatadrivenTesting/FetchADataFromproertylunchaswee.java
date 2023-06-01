package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchADataFromproertylunchaswee {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/PropertFile.properties");
		Properties prop =new Properties();
		prop.load(fis);
		String urlFromPropertyFile=prop.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String usernamePropertyFile=prop.getProperty("username");
		System.out.println(usernamePropertyFile);
		
		String passwordPropertyFile=prop.getProperty("password");
		System.out.println(passwordPropertyFile);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(urlFromPropertyFile);
		
		driver.findElement(By.id("username")).sendKeys(usernamePropertyFile);
		driver.findElement(By.name("pwd")).sendKeys( passwordPropertyFile);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		}

	}
	
	


