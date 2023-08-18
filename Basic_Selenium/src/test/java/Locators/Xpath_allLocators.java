package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_allLocators {
	public static void main (String []args) throws Throwable 
	{
		//manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.nobroker.in/packers-and-movers-in-bangalore?utm_source=google&utm_medium=cpc&utm_campaign=Search_Pune_PnM&adgroup=Google_Recommended_Exact&gclid=Cj0KCQjwiIOmBhDjARIsAP6YhSXa1lIiSsy6ESZRXTlzhjMzpweZ2jzwbYtiCyquzlhRHz90NxWFPgkaAqT5EALw_wcB&relocationType=INTRA_CITY#signup-login");
//fetching the address of mobile number text field
		driver.findElement(By.xpath("//input[contains(@autocomplete,'tel')]")).sendKeys("8806654");
}}
