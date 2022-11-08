package test.day15_pageObjectModel;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C04_PagesKullanim {

    // amazon anasayfaya gidin
    // uc test method'u olusturun
    // Herbir method'da Nutella, Java ve Bicycle icin arama yapip,
    // sonuclarin arama yaptıgımız kelimeleri icerdigini test edin

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void nutellaTesti(){

        amazonPage.aramaKutusu.clear();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));


        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }


    @Test
    public void javaTesti(){
        amazonPage.aramaKutusu.clear();
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }


    @Test(groups = "smoke")
    public void bicycleTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        amazonPage.aramaKutusu.sendKeys("bicycle" + Keys.ENTER);
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "bicycle";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));


    }
}
