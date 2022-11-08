package test.practice;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisesPage;

public class testCase5 {

    //1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
    //      3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and already registered email address
//7. Click 'Signup' button
//8. Verify error 'Email Address already exist!' is visible

    @Test
    public void test1(){

        //1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        //      3. Verify that home page is visible successfully
        SoftAssert softAssert=new SoftAssert();

        String expectedUrl=ConfigReader.getProperty("autoUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
//4. Click on 'Signup / Login' button

//5. Verify 'New User Signup!' is visible

//6. Enter name and already registered email address
//7. Click 'Signup' button


//8. Verify error 'Email Address already exist!' is visible


    }
}
