package com.automationProject;

import java.io.File;


import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxisCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driversfolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://clctab.axisbank.co.in/DigitalChannel/WebForm/NTBCustomer.html");
		
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@name=\"cust_MOB\"]"));
		
		MobileNumber.sendKeys("7032929250");
		
		WebElement PANNumber=driver.findElement(By.xpath("//input[@id=\"cust_PAN\"]"));
		
		PANNumber.sendKeys("CYRPP9269B");
		
		WebElement Pincode=driver.findElement(By.xpath("//input[@id=\"cust_PINCODE\"]"));
		
		Pincode.sendKeys("524004");
		
		WebElement NetAnnualIncome=driver.findElement(By.xpath("//input[@id=\"cust_NETINCOME\"]"));
		
		NetAnnualIncome.sendKeys("200000");
		
		WebElement btnLogin=driver.findElement(By.xpath("//button[@id=\"login_btn\"]"));
		
		btnLogin.click();
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
