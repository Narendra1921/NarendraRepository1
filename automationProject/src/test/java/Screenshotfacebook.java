import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webDriver.chrome.driver","./driversfolder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement Emailaddressorphonenumber=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		Emailaddressorphonenumber.sendKeys("Paturunarendra7393@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
		Password.sendKeys("Bangaram143");
		
		WebElement buttonLogin=driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
		
		buttonLogin.click();
	}

}
