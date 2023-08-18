package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down {
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
            driver.get("https://www.amazon.in/");
            //address of dropdown
            WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	        //Handling this dropdown
            		Select s=new Select(dropDown);
            		s.selectByIndex(8);
            		Thread.sleep(3000);
            		s.selectByValue("search-alias=beauty");
            		Thread.sleep(3000);
                    s.selectByVisibleText("car & Motorbike");
                    Thread.sleep(3000);
                    System.out.println(s.isMultiple());
                    //System.out.println(s.isize());
                    
                    //fetching the options into console
                    List<WebElement> values = s.getOptions();

                    for (WebElement b : values) {
                        System.out.println(b.getText());
                    }
            		
	}
}
