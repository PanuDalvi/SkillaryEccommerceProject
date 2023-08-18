package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Snapdeal {
	

	public static void main (String []args) 
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
			driver .get("https://www.snapdeal.com/");
			//address of sign in
			WebElement sign=driver.findElement(By.xpath("//span[text()='Sign In']"));
			Actions a= new Actions(driver);
			a.moveToElement(sign).perform();
			driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
			
			//handling the frame through the index
			//driver.switchTo().frame(0);
			//handling the frame id
			driver.switchTo().frame("loginIframe");
			
			//handling the frame name
			//driver.switchTo()frame("iframeLogin");
			
			driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("Pranali");
			driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
			//shifting out control to normal web page
			driver.switchTo().defaultContent()	;
			
			
			
			
			
	}
					
}
