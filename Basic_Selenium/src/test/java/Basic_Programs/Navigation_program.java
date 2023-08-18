package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program {
    public static void main(String[] args) throws InterruptedException {
        // Managing drivers
        WebDriverManager.chromedriver().setup();
        // Opening the empty browser
        WebDriver driver = new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
        // Entering the URL
        driver.get("https://www.facebook.com/");

        // Navigating to another URL
        driver.navigate().to("https://www.amazon.in");
        Thread.sleep(5000);

        // Navigate back to the previous page
        driver.navigate().back();
        Thread.sleep(5000);

        // Navigate forward to the next page
        driver.navigate().forward();
        Thread.sleep(5000);

        // Refresh the current page
        driver.navigate().refresh();
        Thread.sleep(5000);

        // Close the browser 
        driver.quit();
    }
}
