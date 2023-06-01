package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D {
	
		@Test(invocationCount=3)
		public void a() {
			System.out.println("hi");
		}
		@Test(dependsOnMethods="a")
		public void b() {
            //used to skip assert
			//Assert.fail();
			System.out.println("Will u go for a date");
		}
		@Test(dependsOnMethods="b")
		public void c() {
			System.out.println("bye");
		}
			

}
