import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement CustomerID=driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
		CustomerID.sendKeys("123456");
		
		WebElement Submitbtn=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
		Submitbtn.click();
		
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		
		try
		{
			try
			{
				String fileName=(new Date()).toString().replace(" ","_").replace(":","-" ).trim()+".png";
				String destinationFilepath=System.getProperty("user.dir")+File.separator+"Screenshots/"+fileName;
				System.out.println(destinationFilepath);
				try
				{
					TakesScreenshot ts=(TakesScreenshot)driver;
					File Source=ts.getScreenshotAs(OutputType.FILE);
					File destination=new File(destinationFilepath);
					FileUtils.copyFile(Source,destination);
				}
				catch(Exception e)
				{
					System.out.println("Exception While taking Screenshot"+e.getMessage());
					
				}
				
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		finally
		{
			
		}
		
	}
	}

