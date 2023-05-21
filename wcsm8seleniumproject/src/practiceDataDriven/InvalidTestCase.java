package practiceDataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTestCase extends Flib{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=666e5do44tck3");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelDat("./data/ActitimeTestData.xlsx","invalidcreds", i, 0);
			String invalidPassword = flib.readExcelDat("./data/ActitimeTestData.xlsx","invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("pwd")).clear();
			
			
			
		}
		
		
	}
}
