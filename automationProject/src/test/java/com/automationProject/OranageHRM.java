package com.automationProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OranageHRM {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		loginButton.click();
		
		
		
		
		
		
		
	}

}
