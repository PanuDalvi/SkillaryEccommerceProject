package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_attributelocator {
	public static void main (String []args) throws Throwable 
	{
		//manage the drivers
		WebDriverManager.chromedriver().setup();
		//upcasting
		WebDriver driver=new ChromeDriver();
		//maximizing
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D60639568242%26ext_vrnc%3Dhi%26hvadid%3D617721280315%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301452%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D13075680100169741001%26hvtargid%3Dkwd-311187680635%26hydadcr%3D5841_2362028%26ref%3Dpd_sl_4b3e4wrxds_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ref_%3Dnav_em_hd_clc_signin_0_1_1_33");
		//fetching the address of email text field using xpath attribute
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Pranali");
		Thread.sleep(2000);
		//fetching the address of password by using contains text
		driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon account')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
