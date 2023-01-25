package com.automationProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Wyndham {
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wyndhamhotels.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement SIGNIN=driver.findElement(By.xpath("//div[@id=\"headerLinkContainer\"]/div/div/div[1]/a[1]"));
		SIGNIN.click();
		
		WebElement Username=driver.findElement(By.xpath("//input[@id=\"wrUsername\"]"));
		Username.sendKeys("paturunarendra7393@gamil.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"wrPassword\"]"));
		Password.sendKeys("Bangaram143");
	}

}
