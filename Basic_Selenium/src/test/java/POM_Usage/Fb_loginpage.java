package POM_Usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Fb_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_loginpage {
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
		//entering the url
		driver.get("https://www.facebook.com/");
		//creating an object for pom class
		Fb_Loginpage fbLogin=new Fb_Loginpage(driver);
		fbLogin.emailTextField("Pranali");
		fbLogin.passwordTextField("dalvi");
		fbLogin.getLoginBtn();		
	}
		
}
