package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 



import org.openqa.selenium.chrome.ChromeDriver;

class Amazon_locator 
{
	
	public static void main (String []args) throws Throwable
	{
		//manage the drivers
				WebDriverManager.chromedriver().setup();
				//upcasting
				WebDriver driver=new ChromeDriver();
				//maximizing
				driver.manage().window().maximize();
				//entering the url
				driver.get("https://www.amazon.in/");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("saree");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
	}
}