package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_page
{
	public static void main (String []args) throws Throwable 
	{
		//Managing drivers
		WebDriverManager.chromedriver().setup();
		//Opening the empty browser
		WebDriver driver=new ChromeDriver();
		//Maximize the browser
		driver. manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		//printing title
		System.out.println(driver.getTitle());
		//printing the current url
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		// Close the browser 
        driver.quit();
		
	}

}
