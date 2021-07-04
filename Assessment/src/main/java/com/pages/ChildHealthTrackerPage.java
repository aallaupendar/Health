package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildHealthTrackerPage {
	WebDriver driver; 
	By mcReg = By.xpath("//h3[text()=' Mother and Child Registration']");
	By cfForm = By.xpath("//h3[text()='Child Followup Form']");
	By successMessage = By.xpath("//p[text()='Form successfully saved!']");
	By homeButton = By.xpath("//i[@class='fa fa-home']");
	
	

	public ChildHealthTrackerPage(WebDriver driver){

        this.driver = driver;
    }
    //click Mother and Child Registration
    public void clickMcReg(){
    	 driver.findElement(mcReg).click();
    }
    
    //click Child Followup Form
    public void clickCfForm(){
    	 driver.findElement(cfForm).click();
    }
    
    public String successMsg(){
   	 return driver.findElement(successMessage).getText();
   }
    
    //click on Home 
    public void clickHome(){
    	 driver.findElement(homeButton).click();
    }
}
