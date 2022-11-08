package test.day15_pageObjectModel;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_DriverKullanimi {

    //bir test methodu olusturun
    // 1- amazona gidin,baslıgının amazon icrdigini dogrulayin
    // 2- nutella icin arama yapin, ve sonucların nutella icerdigini dogrulayin
    // 3- wisequarter sayfasina gidin, url'in wisequarter icerdigini dogrulayin

    @Test
    public void test01(){
        //1- amazona gidin,baslıgının amazon icrdigini dogrulayin
        Driver.getDriver().get("https://www.amazon.com");
        String expectedKelime = "Amazon";
        String actualTitle = Driver.getDriver().getTitle();


        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualTitle.contains(expectedKelime),"baslik amazon icermiyor");

        // 2- nutella icin arama yapin, ve sonucların nutella icerdigini dogrulayin

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu .sendKeys("nutella" + Keys.ENTER);
        WebElement aramasonucElementi=
                Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String arananKelime="Nutella";
        String actualAramaSonucu = aramasonucElementi.getText();
        softAssert.assertTrue(actualAramaSonucu.contains(arananKelime));

        // 3- wisequarter sayfasina gidin, url'in wisequarter icerdigini dogrulayin

        Driver.getDriver().get("https://www.wisequarter.com");
        String arananUrlKelime = "wisequarter";
        String actualURl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualURl.contains(arananUrlKelime),"url wisequarter icermiyor");
        softAssert.assertAll();


        ReusableMethods.bekle(5);
        softAssert.assertAll();
    }
}
