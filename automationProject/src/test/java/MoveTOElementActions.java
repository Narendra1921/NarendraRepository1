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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveTOElementActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 
		Actions actions=new Actions(driver);
		
	WebElement menuLink=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
	actions.moveToElement(menuLink).build().perform();
	
	WebElement buttonSignin=driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]/a"));
	buttonSignin.click();
	
	WebElement Emailormobilephonenumber=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
	Emailormobilephonenumber.sendKeys("7032929250");
	
	WebElement buttoncontinue=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
	buttoncontinue.click();
	
	WebElement Password=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
	Password.sendKeys("Bangaram143");
	
	WebElement buttonSignin1=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
	buttonSignin1.click();
	
	WebElement Searchbar=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	Searchbar.sendKeys(" One Plus Nord Mobiles");
	
	WebElement buttonsubmit=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	buttonsubmit.click();
	
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


