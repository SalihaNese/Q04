package test.smokeTests;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyCoursedemyPage;

public class PozitifLoginTesti {
    // Mycoursedemy anasayfasina gidin
// login linkine basin
// Kullanici email'i olarak valid email girin
// Kullanici sifresi olarak valid sifre girin
// Login butonuna basarak login olun
// Basarili olarak giris yapilabildigini test edin

    @Test
    public void pozitifLoginTesti(){


        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
      // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();//butun methodlara uladabilirim artık
                                                   // cunku obje olusturduk
        myCoursedemyPage.loginLinki.click();

     // Kullanici email'i olarak valid email girin
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
     // Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));

        myCoursedemyPage.cookies.click();
        ReusableMethods.bekle(2);

     // Login butonuna basarak login olun
        myCoursedemyPage.loginButonu.click();

     // Basarili olarak giris yapilabildigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());

        softAssert.assertAll();

     Driver.closeDriver();


    }
}
