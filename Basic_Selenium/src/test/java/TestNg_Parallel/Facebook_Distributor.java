package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Distributor {
	@Test
	public void facebook() throws Throwable {
	WebDriverManager.chromedriver().setup();
	//upcasting
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//entering the url
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.close();
	}

}
