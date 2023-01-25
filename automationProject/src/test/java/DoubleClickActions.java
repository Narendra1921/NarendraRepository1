import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webDriver.chrome.driver","./driversfolder/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.online.citibank.co.in/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	Actions action = new Actions(driver);
	
	WebElement newSearch=driver.findElement(By.xpath("//div[@id=\"search\"]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a"));
	action.doubleClick(newSearch).build().perform();
	}

}
