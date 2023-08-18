package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Getting {
	public static void main (String []args) throws Throwable
	{
		//manages the chrome driver
		WebDriverManager.chromedriver().setup();
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();	
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//entered the url
		driver.get("https://www.amazon.in/");
		//address of mobile
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute:"+mobile.getAttribute("class"));
		System.out.println("Attribute:"+mobile.getTagName());
	
}}
