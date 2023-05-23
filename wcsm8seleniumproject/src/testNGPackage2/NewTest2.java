package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void d() {
		Reporter.log("d method from NewTest2", true);
	}
	
	@Test
	public void e() {
		Reporter.log("e method from NewTest2", true);
	}
	
	@Test
	public void f() {
		Reporter.log("f method from NewTest2", true);
	}
}
