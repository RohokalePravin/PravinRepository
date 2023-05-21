package frmaeHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/iframe.html");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("i2"));
		username.sendKeys("admin");

		// driver.switchTo().frame(0);//handle by using index
		// driver.switchTo().frame("frame");//handle by using name or id
		WebElement frameElemnet = driver.findElement(By.name("frame"));
		driver.switchTo().frame(frameElemnet);// handle by using webelement
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("i1"));
		password.sendKeys("manager");

		Thread.sleep(2000);
		password.clear();
        //driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		username.clear();

	}

}
