package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_selector {
	public static void main (String []args) 
	{
		//manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		//fetching the address of text field
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pranali");
	}
}
