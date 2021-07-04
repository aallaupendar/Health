package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationFormPage {
	WebDriver driver;
	By closePopup = By.xpath("//button[@data-dismiss='alert']");
	By enterMotherName = By.xpath("//textarea[@maxlength='100000']");
	By recentBirth = By.xpath("(//input[@type='text'])[1]");
	By clickCalendar = By.xpath("//span[@class='input-group-addon']");
	By motherAge = By.xpath("(//input[@type='text'])[2]");
	By childCount = By.xpath("(//input[@type='text'])[3]");
	By childName = By.xpath("//c[@maxlength='100000']|(//textarea[@maxlength='100000'])[2]");
	By childAge = By.xpath("(//input[@type='text'])[4]");
	By submit = By.xpath("//button[text()='Submit']");
	
	
	
	public RegistrationFormPage(WebDriver driver){

        this.driver = driver;

    }
	
    //Click on close popup
    public void clickClose(){
        driver.findElement(closePopup).click();
     }
    
    // Enter the new mother's name
    public void setMotherName(String motherName){
        driver.findElement(enterMotherName).sendKeys(motherName);
     }
    
    // Enter the dob
    public void setBirthDate(String dob){
        driver.findElement(recentBirth).sendKeys(dob);
     }
    //Click on Calendar
    public void clickCalendar(){
        driver.findElement(recentBirth).click();
     }
      
    // Enter mother age
    public void setMotherAge(String ma){ 
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(motherAge)).sendKeys(ma);
     }
    // Enter child count
    public void setChildCount(String cc){
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(childCount)).sendKeys(cc);
        //driver.findElement(childCount).sendKeys(cc);
     }
    //Click on Calendar
    public void clickChildCount(){
        driver.findElement(childCount).click();
    }
    // Enter the child name
    public void setChildName(String cName){
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(childName)).sendKeys(cName);
     }
    
    // Enter child age
    public void setChildAge(){	
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(childAge)).click();
     }
    // Click submit
    public void clickSubmit(){
        driver.findElement(submit).click();
     }
}
