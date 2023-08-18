package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_child_Firefox {
	public static void main (String []args)
	{
		FirefoxOptions option= new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.firefoxdriver().setup();
		//upcasting
		WebDriver driver=new FirefoxDriver();
		//maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//entering the url
		driver.get("https://quiker.com/");
	}
}
