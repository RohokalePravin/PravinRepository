package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathInFirefox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=dlV5Nm52cTJjMDUwZ09IemhkSVhra3FEZ3pWYjBmemdwbWxSR0RzNH5iUmNQ_en-GB_false_&nonce=dlV5Nm52cTJjMDUwZ09IemhkSVhra3FEZ3pWYjBmemdwbWxSR0RzNH5iUmNQ&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=pWI59_ilkPNNgZAUbfro4mPT4xDHp55y3NPm7dCBd8Y&ui_locales=en-GB");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("abcdef@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("xbcdh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
