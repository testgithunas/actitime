package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFrompropertyFile {

	
		public static void main(String[] args) throws IOException  {
			
			FileInputStream fis=new FileInputStream("./TestData/PropertFile.properties");
			Properties prop =new Properties();
			prop.load(fis);
			String urlFromPropertyFile=prop.getProperty("url");
			System.out.println(urlFromPropertyFile);
			
			String usernamePropertyFile=prop.getProperty("username");
			System.out.println(usernamePropertyFile);
			
			String passwordPropertyFile=prop.getProperty("password");
			System.out.println(passwordPropertyFile);

			}

		}
