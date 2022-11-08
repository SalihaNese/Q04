package test.practice;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisesPage;

public class testCase4 {
    @Test
    public void test4(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        SoftAssert softAssert=new SoftAssert();// bunu bir kere tanımlasak yetrli heryerden kullanabiliriz
        String expectedUrl="http://automationexercise.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"homepage'de degilsiniz");

        //4. Click on 'Signup / Login' button
        AutomationExercisesPage automationExercisesPage=new AutomationExercisesPage();
        ReusableMethods.bekle(5);
        automationExercisesPage.signUpLinki.click();

        // 5. Verify 'Login to your account' is visible
        softAssert.assertTrue(automationExercisesPage.loginAccountElementi.isDisplayed(),"logın to your account görünmüyor");

        // 6. Enter correct email address and password
        automationExercisesPage.emailKutusu.sendKeys("aurora11@gmail.com");
        automationExercisesPage.passwordKutusu.sendKeys("123456");

        // 7. Click 'login' button
        automationExercisesPage.loginButonu.click();

        // 8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(automationExercisesPage.loginAccountElementi.isDisplayed());
      // automatıonExercicePageda loginAccountElementi gorunuyor mu demek
        //  9. Click 'Logout' button
        automationExercisesPage.loggedinAs.isDisplayed();

        //10. Verify that user is navigated to login page
        softAssert.assertTrue(automationExercisesPage.loginAccountElementi.isDisplayed());

        softAssert.assertAll(); //assert'lerden sonra mutlaka bunu yazmalıyız yoksa softasser test etmez
                                     // bu softassert'ın ozelligi
        Driver.closeDriver();
    }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    // aurora1@gmail.com //123456
    //aurora11@gmail.com //123456
    //aurora111@gmail.com //123456


}
