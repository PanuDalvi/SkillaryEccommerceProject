package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down2 {
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
            driver.get("https://demoapp.skillrary.com/");
            WebElement opt=driver.findElement(By.id("cars"));
            
            Select s =new Select(opt);
            s.selectByIndex(1);
            Thread.sleep(3000);
            s.selectByValue("199");
            Thread.sleep(3000);
           s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
           
           Thread.sleep(3000);
           s.deselectByIndex(1);
           Thread.sleep(3000);
           s.deselectByValue("199");
           Thread.sleep(3000);
           s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
           
           List<WebElement> ele = s.getAllSelectedOptions();
           for (WebElement ele1 : ele) {
               System.out.println(ele1.getText());
           }
           Thread.sleep(3000);
           driver.close();
           
           
           
           
            
            
            
	}
	}
	
	


