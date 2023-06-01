package TestNG;

import org.testng.annotations.Test;
//we can give the priority in this to change order as without priority it follow alphabatically
public class B {
	@Test(priority=10)
	public void akash() {
		System.out.println("Name=akash");
	}
	@Test(priority=4)
	public void vikas() {
		System.out.println("Name=Vikas");
	}
	@Test(priority=2)
	public void prakash() {
		System.out.println("Name=Prakash");
	}



}
