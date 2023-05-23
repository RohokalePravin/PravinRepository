package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
	@Test
	public void g() {
		Reporter.log("g method from NewTest3", true);
	}
	
	@Test
	public void h() {
		int a=12;
		int b=8;
		int res=a/b;
		Reporter.log("h method from NewTest3", true);
	}
	
	@Test
	public void i() {
		int a=12;
		int b=7;
		int res=a/b;
		Reporter.log("i method from NewTest3", true);
	}
}
