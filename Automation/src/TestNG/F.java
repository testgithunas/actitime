package TestNG;

import org.testng.annotations.Test;

public class F {
	@Test(groups="smoke",priority=1)
	public void sighUp() {
		System.out.println("the user has sighup");
	}
	@Test(groups="smoke",priority=2)
	public void signIn() {
		System.out.println("the user has sighin");
	}
	
	@Test(groups="regression",priority=3)
	public void compose() {
		System.out.println("user has compose a mail");
	}




}
