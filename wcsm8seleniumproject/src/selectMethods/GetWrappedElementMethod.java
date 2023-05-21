package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/MultipleSelectDropdown.html");

		WebElement dropDown = driver.findElement(By.name("Menu"));

		Select sel = new Select(dropDown);
		
		WebElement options = sel.getWrappedElement();
		String values = options.getText();
		System.out.println(values);


	}

}
