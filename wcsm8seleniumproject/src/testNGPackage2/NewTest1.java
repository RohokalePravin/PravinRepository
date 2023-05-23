package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void a() {
	  Reporter.log("a method from NewTest1",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("b method from NewTest1",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("c method from NewTest1",true);
  }
}
