package com.testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.test.common.TestBase;

public class syncButtonFunctionality extends TestBase {
	@Test(priority=2)
    public void test_syncButtonFunctionality(){
        //Create home Page object
    	HomePage objHome = new HomePage(driver);
    	objHome.clickSync();
    	Assert.assertTrue(objHome.successMsg().contains("User Data successfully synced."), 
    			"Sync Functionality not successful");
	}
}
