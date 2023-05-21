package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver   driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/MultipleSelectDropdown.html");
	     WebElement dropDown = driver.findElement(By.id("i1"));
	     Select sel = new Select(dropDown);
	     List<WebElement> allOption = sel.getOptions();
	     TreeSet<String> ts = new TreeSet<String>();
	     for(int i=0;i<allOption.size();i++)
	     {
	    	 String op = allOption.get(i).getText();
	    	 ts.add(op);
	     }
         for(String option:ts)
         {
        	 Thread.sleep(2000);
        	 System.out.println(option);
         }
	}

}
