package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected
{
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
		driver.get("https://www.facebook.com/");
		//address of create new account
		driver.findElement(By.linkText("Create new account")).click();
	    //address the radio button
		WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
		radioBtn.click();
		Thread.sleep(5000);
		//is selected
		if(radioBtn.isSelected()) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}
	
	
		

}
