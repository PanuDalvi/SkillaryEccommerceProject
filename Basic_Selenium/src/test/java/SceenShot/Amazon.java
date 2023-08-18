package SceenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
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
		driver.get("https://www.amazon.in/");
		//downcasting
        TakesScreenshot ts =(TakesScreenshot)driver;
        
        //we access the method
        File src=ts.getScreenshotAs(OutputType.FILE);
        //creating an object for physical file
        File dest = new File("./ScreenShot/amazon.png");
        FileUtils.copyFile(src, dest);
        driver.close();
        
        
       
	}
}
