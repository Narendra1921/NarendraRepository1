import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search_TextBox=driver.findElement(By.xpath("//input[@name='q']"));
		search_TextBox.sendKeys("citibank");
		search_TextBox.sendKeys(Keys.ENTER);
		Actions actions=new Actions(driver);
		WebElement newSearch=driver.findElement(By.xpath("//div[@id=\"search\"]/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/a"));
		
			actions.contextClick(newSearch).build().perform();
		
		
	}

}
