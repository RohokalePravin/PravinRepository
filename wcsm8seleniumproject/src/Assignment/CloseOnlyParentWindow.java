package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentWindow {

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
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 250) + ")");
		Thread.sleep(2000);
		// handle Parent/current window adress
		String parentHandle = driver.getWindowHandle();
		System.out.println("handle of parent window:" + parentHandle);
		// click on link get child window
		link.click();
		Thread.sleep(2000);
		driver.close();

	}

}
