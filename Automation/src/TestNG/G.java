package TestNG;

import org.testng.annotations.Test;

public class G {
	
	@Test(groups="smoke",priority=5)
	public void logout() {
		System.out.println("the user has logedout");
	}
	
	@Test(groups="regression",priority=4)
	public void sendmail() {
		System.out.println("user has sent a mail");
	}


}
