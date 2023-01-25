import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("scroll(0, 5000);");
	
	Thread.sleep(5000);
	
	jse.executeScript("scroll(0,-5000);");
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


