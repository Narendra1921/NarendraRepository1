import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDemoScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/v4/index.php");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement UserID=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
UserID.sendKeys("mngr376887");

WebElement password=driver.findElement(By.name("password"));
password.sendKeys("utubEpU");


//System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
//WebDriver dirver=new ChromeDriver();
//Sytem.setProperty("webDriver.chrome.driver","./driversfolder/Chromedriver.exe");
//WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
//btnLogin.click();

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

