package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void methid1() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+": is the thread id of method",true);
	  Reporter.log("method 1",true);
  }
  
  @Test
  public void methid2() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+": is the thread id of method",true);
	  Reporter.log("method 2",true);
  }
  
  @Test
  public void methid3() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+": is the thread id of method",true);
	  Reporter.log("method 3",true);
  }
}
