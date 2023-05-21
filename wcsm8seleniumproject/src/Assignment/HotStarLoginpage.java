package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotStarLoginpage {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/paywall#mp-login?filters=journey_type%3Dsubs_journey");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@aria-hidden='true']")).click();
		driver.findElement(By.xpath("//button[@fdprocessedid='uewbp']")).click();
		driver.findElement(By.xpath("//input[@title='Phone number']")).sendKeys("9874561230");
		driver.close();
	}
}
	