package test.day15_pageObjectModel;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DriverIlkClass {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");
        // arama kutusuna Nutella yazdiralım



        //Driver.getDriver().get("https://wisequarter.com");
        //Driver.getDriver().get("https://youtube.com");


    }

    @Test
    public void test02(){
        Driver.closeDriver();
    }
}
