package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By iAgree = By.xpath("//button[@id='eula-agree']");
	By childHealthTracker = By.xpath("//h3[text()='Child Health Tracker']");
	By syncButton = By.xpath("//h3[text()='Sync']");
	By syncMsg = By.xpath("(//div[contains(text(),'User Data successfully synced')])[1]");
	
	public HomePage(WebDriver driver){

        this.driver = driver;

    }
     
    //Click on I agree button
    public void clickIagree(){
        driver.findElement(iAgree).click();
     }
    
    //Click on child health tracker 
    public void clickChildHealthTracker(){
        driver.findElement(childHealthTracker).click();
     }
   //Click on sync 
    public void clickSync(){
        driver.findElement(syncButton).click();
     }
    public String successMsg(){
      	 return driver.findElement(syncMsg).getText();
      }
}
	