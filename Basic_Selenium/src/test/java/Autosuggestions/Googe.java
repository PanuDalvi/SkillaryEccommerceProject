package Autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googe {
	public static void main (String []args) throws Throwable
	{
	//manage the drivers
			WebDriverManager.chromedriver().setup();
			//upcasting
			WebDriver driver=new ChromeDriver();
			//maximizing
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//entered the url
			driver.get("https://www.google.com/");
			//address of search textfield
			driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
			Thread.sleep(3000);
			//address of autosuggestion
			List<WebElement>list=driver.findElements(By.xpath("//li[@data-view-type='1']"));
			Thread.sleep(3000);
			for(WebElement b:list)
			{
				System.out.println(b.getText());
			}
			
			driver.close();
			
}
}
