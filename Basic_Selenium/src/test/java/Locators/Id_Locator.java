package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Id_Locator {
	
	public static void main (String []args) throws Throwable
	{
		//manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		//fetching the address of email textfield
		driver.findElement(By.id("email")).sendKeys("Pranali");
		Thread.sleep(5000);
		//fetching the address of password text field
		driver.findElement(By.name("pass")).sendKeys("password");
		Thread.sleep(5000);
		//address of link using linktextmethod
		driver.findElement(By.linkText("Forgotten password?")).click();
		//address of link with partialLinkText method
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
