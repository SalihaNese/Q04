package test.day15_pageObjectModel;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisesPage;

public class C06_AutomationExercises {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //     3. Verify that home page is visible successfully
    //4. Click on ‘Signup / Login’ button
    //5. Verify ‘Login to your account’ is visible
    //6. Enter correct email address and password
    //7. Click ‘login’ button
    //8. Verify that ‘Logged in as username’ is visible
    //9. Click ‘Delete Account’ button
    //10. Verify that ‘ACCOUNT DELETED!’ is visible

    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //     3. Verify that home page is visible successfully
        SoftAssert softAssert=new SoftAssert();
        String expectedUrl="https://automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"homepage'de degilsiniz");

        //4. Click on ‘Signup / Login’ button
        AutomationExercisesPage automationExercisesPage=new AutomationExercisesPage();
        ReusableMethods.bekle(5);
        automationExercisesPage.signUpLinki.click();

        //5. Verify ‘Login to your account’ is visible
        softAssert.assertTrue(automationExercisesPage.loginAccountElementi.isDisplayed());
        //6. Enter correct email address and password
        automationExercisesPage.emailKutusu.sendKeys("aurora@gmail.com");
        automationExercisesPage.passwordKutusu.sendKeys("aurora");

        //7. Click ‘login’ button
        automationExercisesPage.loginButonu.click();

        //8. Verify that ‘Logged in as username’ is visible
        //9. Click ‘Delete Account’ button
        //10. Verify that ‘ACCOUNT DELETED!’ is visible


        softAssert.assertAll();
        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
}
