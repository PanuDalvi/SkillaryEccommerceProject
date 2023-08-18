package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_launching {


public static void main (String []args)
{
	//manages the Firefox driver
	WebDriverManager.firefoxdriver().setup();
	
	FirefoxDriver driver=new FirefoxDriver();
	
	
}
}