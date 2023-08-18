package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName_Locator {
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
		//fetching all the links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement allLinks:links)
		{
			System.out.println(allLinks.getText());
		}
		}
}
