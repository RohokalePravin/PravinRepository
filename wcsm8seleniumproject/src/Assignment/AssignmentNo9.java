package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo9 {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver   driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/MultipleSelectDropdown.html");
     WebElement dropDown = driver.findElement(By.id("i1"));
     Select sel = new Select(dropDown);
       HashSet<String> hs = new HashSet<String>();
       List<WebElement> allOption = sel.getOptions();
       for(int i=0;i<allOption.size();i++)
       {
    	   String text = allOption.get(i).getText();
    	   hs.add(text);
       }
       for(String value:hs)
       {
    	   System.out.println(value);
       }
	}

}
