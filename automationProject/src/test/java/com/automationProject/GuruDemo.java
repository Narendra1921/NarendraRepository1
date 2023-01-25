
package com.automationProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Emailaddress=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Emailaddress.sendKeys("paturunarendra7393@gamil.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
		Password.sendKeys("Bangaram143");
		
	}

}
