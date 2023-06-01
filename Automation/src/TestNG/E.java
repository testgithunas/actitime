package TestNG;

import org.testng.annotations.Test;

public class E {
	

	@Test
	public void a() {
		System.out.println("hi");
	}
	@Test(enabled=false)
	public void b() {
		System.out.println("Will u go for a date");
	}
	@Test
	public void c() {
		System.out.println("bye");
	}

}
