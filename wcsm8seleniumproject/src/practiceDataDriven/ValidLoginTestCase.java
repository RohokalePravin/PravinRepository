package practiceDataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase extends Flib{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=666e5do44tck3");
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelDat("./data/ActitimeTestData.xlsx", "validcreds", 1, 0));
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelDat("./data/ActitimeTestData.xlsx", "validcreds", 1, 1));
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
	}

}
