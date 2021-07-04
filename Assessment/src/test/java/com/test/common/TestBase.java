package com.test.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase  {
	protected WebDriver driver;
	@BeforeMethod
    public void setup(){
		String userName = "test_userE";
		String password = "123";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UPENDAR\\Desktop\\Selenium_Softwares\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.commcarehq.org/a/automation-engineer/cloudcare/apps/v2/#apps");   
        driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
        driver.findElement(By.xpath("//input[@name='auth-username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='auth-password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
	
	@AfterMethod
	public void tearDown(){
		if(driver!=null)
		{
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

}
