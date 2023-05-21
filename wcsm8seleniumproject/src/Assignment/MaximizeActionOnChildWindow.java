package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeActionOnChildWindow {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter url
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		//Scrolling operation
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 250) + ")");
		Thread.sleep(2000);
		
		//address of parent window
		String parentHandle = driver.getWindowHandle();
		
		// click on link get child window
		link.click();
		Thread.sleep(2000);
		
		//address of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		
		//maximize browser
		for( String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				 driver.switchTo().window(wh).manage().window().maximize();
			}
		}
		
		

	}

}