package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLinkLocator
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdrver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/LinkWebElement.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Flip")).click();
	driver.close();
	
}
}
