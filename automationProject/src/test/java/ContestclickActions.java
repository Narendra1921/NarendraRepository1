import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContestclickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driversfolder/chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement search_TextBox=driver.findElement(By.xpath("//inpt[Aname='q']"));
		search_TextBox.sendKeys("citibank");
		search_TextBox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		WebElement newSearch=driver.findElement(By.xpath("//div[@id=\"search\"]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a"));
		actions.contextClick(newSearch).build().perform();
	
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


