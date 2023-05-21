package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser
{ 
	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	  new EdgeDriver();
	  
	}
}
