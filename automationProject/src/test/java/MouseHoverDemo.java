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

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		Actions actions=new Actions(driver);
		
		WebElement menuLink=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		actions.moveToElement(menuLink).build().perform();
		
		WebElement yourOrdersLink=driver.findElement(By.xpath("//a[@id=\"nav_prefetch_yourorders\"]"));
		yourOrdersLink.click();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	