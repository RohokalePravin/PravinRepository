package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("file:///C:/Users/Pravin/OneDrive/Desktop/wcsm8workspace/SingleSelectStaticDropdown.html");
	    
	    WebElement dropDown = driver.findElement(By.name("Menu"));
	    
	    
	    // To handle dropDown create obj of Select Class
	          Select sel = new Select(dropDown);
	          
	   // to get all the Options From DropDown
	          List<WebElement> allOptions = sel.getOptions();
	          
       // to eliminate the duplicates & maintain the order of insertion we use
	           TreeSet<String> ts = new TreeSet<String>();
	   
	  // to read the list by eliminating duplicates.....
	           for(int i=0;i<allOptions.size();i++)
	           {
	        	   // get the options & text of options
	        	   String op = allOptions.get(i).getText();
	        	   
	        	   // add the text of options to TreeSet
	        	     ts.add(op); 
	        	  
	           }
	           
	 // to read the options from set
	            for(String options:ts) 
	            {
	            	Thread.sleep(2000);
	            	System.out.println(options);
	            }
    	           
	           

	}

}
