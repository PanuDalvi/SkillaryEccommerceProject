package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_locators
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
		driver.get("https://www.facebook.com/");
		//fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pranali");
		Thread.sleep(2000);
		//fetching the address of password text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Dalvi");
		Thread.sleep(2000);
		//fetching the address of forgotten password with the help of xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		Thread.sleep(2000);
		driver.close();
}}