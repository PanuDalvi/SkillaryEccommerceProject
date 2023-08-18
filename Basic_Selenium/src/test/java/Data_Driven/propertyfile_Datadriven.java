package Data_Driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyfile_Datadriven {
	public static void main(String[]args)throws Throwable{
	
	//create an object for properties class
	Properties p=new Properties();
	//create an object for physical file
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
	//Loading fis
	p.load(fis);
	String Url=p.getProperty("url");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(Url);
}

}
