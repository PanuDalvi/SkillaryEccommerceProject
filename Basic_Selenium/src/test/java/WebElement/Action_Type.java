package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Type {
	public static void main (String []args) throws Throwable{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	//address of email textfield
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("Pranali");
	Thread.sleep(5000);
	email.clear();
	
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	login.submit();
	
}

}
