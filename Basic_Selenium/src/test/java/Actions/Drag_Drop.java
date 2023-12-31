package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
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
			driver .get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop//");
            //address of block1
			WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
            //address of block4
            WebElement block4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
            
            Actions a=new Actions(driver);
            a.dragAndDrop(block1, block4).perform();
            
            
            
}
}