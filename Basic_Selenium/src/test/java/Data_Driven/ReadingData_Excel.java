package Data_Driven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingData_Excel {
	public static void main(String[]args)throws Throwable{
		//creating an object for physical file
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		//create an workbook factory
		Workbook wb=WorkbookFactory.create(fis);
		//get the value
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		String title=driver.getTitle();
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);

		//create an object for the fileoutstream
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
	}

}
