package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsset {
	@Test
	public void demo() {
	String a ="abc";
	String b ="abc";
	//if we take def than it will not pass 
	//String b ="def";
	
	Assert.assertEquals(a,b);
	System.out.println("pass");
	

}
}
