package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {
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
			driver .get("https://demoapp.skillrary.com/");
			//address of course
			WebElement course=driver.findElement(By.id("course"));
			//creating an object for actions class
			Actions a=new Actions(driver);
			a.moveToElement(course).perform();
			//address of selenium training
		    driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
			//address of + button
			WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
			a.doubleClick(plus).perform();
			
			Thread.sleep(3000);
			driver.close();
			
			
}}
