package com.automationProject;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement email=driver.findElement(By.xpath("//a[text()='Click Here']"));

		email.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
				
		Set<String>set=driver.getWindowHandles();
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			System.out.println(childWindow);
			if(!parentWindow.equalsIgnoreCase(childWindow))
			{
				//switching to child window
				
				//driver.switchTo().alert()
				
				driver.switchTo().window(childWindow);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.name("emailid")).sendKeys("divyasree515@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				//closing the window
				//driver.close();
			}
			//driver.switchTo().window(parentWindow);

			}
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