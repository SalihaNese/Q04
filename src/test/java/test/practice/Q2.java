package test.practice;

import Utilities.TestBase;
import Utilities.TestBaseClass;
import org.testng.annotations.Test;


public class Q2 extends TestBaseClass {

    /*
    - Birbirine bagimli testler olusturun.
    - beforeClass olusturup setUp ayarlarini yapin.
    - Birbirine bagimli testlr olusturarak ;
        =>ilk once facebook'a gidin
        =>sonra facebook'a bagimli olarak google'a gidin
        =>daha sonra google'a bagimli olarak amazon'a gidin
    -driver'i kapatin.
     */

    @Test(dependsOnMethods = "facebook")
    public void googleTest(){
        driver.get("https://www.google.com");
    }

    @Test
    public void facebookTest(){
        driver.get("https://www.facebook.com");
    }

    @Test(dependsOnMethods = "google")
    public void amazonTest(){
        driver.get("https://www.amazon.com");
    }
}
