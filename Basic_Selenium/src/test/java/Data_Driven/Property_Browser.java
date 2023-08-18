package Data_Driven;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Browser {
	
	public static void main(String[]args) throws Throwable
	{
		Properties p=new Properties();
		//create an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
		//Loading fis
		p.load(fis);
		String Url=p.getProperty("url");
		String brow=p.getProperty("browser");
		
		WebDriver driver;
		if(brow.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
	}

}
