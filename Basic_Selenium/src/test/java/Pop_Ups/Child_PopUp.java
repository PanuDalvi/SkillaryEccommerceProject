package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_PopUp {
	public static void main (String []args) throws Throwable {
		//manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//entering the url
		driver.get("https://skillrary.com/");
		//handling parent window
		String parent= driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary '])[2]")).click();
		//Handling child window
		Set<String>child=driver.getWindowHandles();
		for (String b:child) {
			driver.switchTo().window(b);
			//address of element in child window
			driver.findElement(By.id("mytext")).sendKeys("Pranali");
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
			Thread.sleep(5000);
			driver.quit();		}
		
	}
}
