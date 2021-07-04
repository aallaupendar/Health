package com.testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ChildHealthTrackerPage;
import com.pages.FollowUpFormPage;
import com.pages.HomePage;
import com.test.common.TestBase;

public class FollowUpFormSubmit extends TestBase{
	@Test(priority=1)
    public void test_FollowUpFormSubmit() throws InterruptedException{

        //Create home Page object
    	HomePage objHome = new HomePage(driver);
    	 //click on Child health tracker
    	 objHome.clickChildHealthTracker();    	 
    	 //create child health tracker page
    	 ChildHealthTrackerPage tracker = new ChildHealthTrackerPage(driver);
    	 tracker.clickCfForm();  	 
    	 FollowUpFormPage followForm = new FollowUpFormPage(driver);
    	 followForm.setSearch("Jessy");
    	 Thread.sleep(3000);
    	 followForm.clickSearch();
    	 Thread.sleep(3000);
    	 followForm.clickSearchForm();
    	 Thread.sleep(3000);
    	 followForm.clickSearchForm();
    	 followForm.clickContinue();
    	 followForm.clickVactionRec();
    	 followForm.clickSubmit(); 
    	 Assert.assertTrue(tracker.successMsg().equals("Form successfully saved!"), "Form not submitted");

    }

}
