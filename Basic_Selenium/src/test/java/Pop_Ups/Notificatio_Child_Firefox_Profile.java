package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Notificatio_Child_Firefox_Profile {
	public static void main (String []args) {
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("dom.webnotifications.enabled", false);
	WebDriver driver=new FirefoxDriver();
	//maximizing
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//entering the url
	driver.get("https://quikr.com/");

}
}