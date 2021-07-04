package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FollowUpFormPage {
	WebDriver driver;
	By search = By.xpath("//input[@id='searchText']");
	By searchButton = By.xpath("//button[@id='case-list-search-button']");
	By searchForm = By.xpath("//tbody/tr[1]");
	By continueButton = By.xpath("//button[text()='Continue']");
	By vactionRec = By.xpath("//p[text()='Chickenpox']");
	By submit = By.xpath("//button[text()='Submit']");
	
	public FollowUpFormPage(WebDriver driver){
        this.driver = driver;
    }
     

    public void setSearch(String text){
        driver.findElement(search).sendKeys(text);
     }
    
    public void clickSearch(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton)).click();
        //driver.findElement(searchButton).click();
     }
    public void clickSearchForm(){
        driver.findElement(searchForm).click();
     }
    public void clickContinue(){
        driver.findElement(continueButton).click();
     }
    public void clickVactionRec(){
        driver.findElement(vactionRec).click();
     }
    public void clickSubmit(){
        driver.findElement(submit).click();
     }

}
