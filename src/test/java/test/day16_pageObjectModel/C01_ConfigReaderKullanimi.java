package test.day16_pageObjectModel;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C01_ConfigReaderKullanimi {

    // amazon anasayfaya gidin
    //1 1 test methodu olusturun
    // Nutella icin arama yapip
    // sonucların arama yaptıgımız kelimeleri icerdigini test edin

    @Test
    public void test01(){
        // amaxon anasayfaya gidin
        //1 1 test methodu olusturun
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella icin arama yapip
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAramaKelimesi")+ Keys.ENTER);

        // sonucların arama yaptıgımız kelimeyi icerdigini test edin

        String expextedKelime=ConfigReader.getProperty("amazonAramaKelimesi");
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();


        Assert.assertTrue(actualAramaSonucu.contains(expextedKelime));
        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
}
