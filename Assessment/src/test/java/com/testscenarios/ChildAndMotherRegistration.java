package com.testscenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ChildHealthTrackerPage;
import com.pages.HomePage;
import com.pages.RegistrationFormPage;
import com.test.common.TestBase;

public class ChildAndMotherRegistration extends TestBase{
	@Test(priority=0)
    public void test_childAndMotherRegistration(){

        //Create home Page object
    	HomePage objHome = new HomePage(driver);
    	 //click on Child health tracker
    	 objHome.clickChildHealthTracker();    	 
    	 //create child health tracker page
    	 ChildHealthTrackerPage tracker = new ChildHealthTrackerPage(driver);
    	 tracker.clickMcReg(); 
    	 //create Registration Form page
    	 RegistrationFormPage regForm = new RegistrationFormPage(driver);
    	 //close popup
    	 regForm.clickClose();
    	 //enter mother name
    	 regForm.setMotherName("Jessy");
    	 //enter dob
    	 regForm.setBirthDate("06/08/2020");
    	 //click Calendar
    	 regForm.clickCalendar(); 
    	 //enter child count
    	 regForm.setChildCount("1");
    	//enter mother age
    	 regForm.setMotherAge("30");
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,250)", "");
    	 
    	 //enter child name
    	 regForm.setChildName("John");
    	 //enter child age
    	 regForm.setChildAge();
    	 //click submit
    	 regForm.clickSubmit();
    	 Assert.assertTrue(tracker.successMsg().equals("Form successfully saved!"), "Form not submitted");

    }
	

}
