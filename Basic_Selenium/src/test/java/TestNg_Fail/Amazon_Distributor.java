package TestNg_Fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Distributor {
@Test
public void amazon() throws Throwable {
WebDriverManager.chromedriver().setup();
//upcasting
WebDriver driver=new ChromeDriver();
//maximizing
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//entering the url
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.close();
}
}