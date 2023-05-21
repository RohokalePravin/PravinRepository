package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxXpath 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=666e5do44tck3");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='logout']")).click();
	Thread.sleep(2000);
	driver.close();
}
}
