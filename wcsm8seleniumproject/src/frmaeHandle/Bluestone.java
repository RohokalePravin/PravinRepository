package frmaeHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		
		//switch the control to frame to click on chat
		// by using name or id
		driver.switchTo().frame("fc_widget");
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
        
        //switch the control to default webpage
        driver.switchTo().defaultContent();
        
        //insert the inputs for text box
        driver.findElement(By.id("chat-fc-name")).sendKeys("abcdr_123");
        driver.findElement(By.id("chat-fc-email")).sendKeys("sget456@gmail.com");
        driver.findElement(By.id("chat-fc-phone")).sendKeys("98715661145");
        
	}

}
