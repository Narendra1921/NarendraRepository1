package com.automationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver","./mydrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		email.sendKeys("paturunarendra7393@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]]"));
		password.sendKeys("Bangaram143");
		
			}

}
