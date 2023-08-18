package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver_launching 
{
	public static void main (String []args)
	{
		//manages the Chrome driver
		WebDriverManager.chromedriver().setup();
		
		//opening chrome browser
		WebDriver driver=new ChromeDriver();
	}
}
