package TestNG;

import org.testng.annotations.Test;

public class C {
	//used to  repeat
	
		@Test(invocationCount=3)
		public void a() {
			System.out.println("oh");
		}
		@Test
		public void b() {
			System.out.println("jaane");
		}
		@Test
		public void c() {
			System.out.println("jaana");
			
		}

}
