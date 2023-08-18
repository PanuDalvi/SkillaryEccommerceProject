package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {
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
			driver .get("https://www.amazon.in/");
			
	
			WebElement tField=driver.findElement(By.id("twotabsearchtextbox"));
			Actions a=new Actions(driver);
			a.contextClick(tField).perform();
			Thread.sleep(3000);
			driver.close();
			
	}

}
