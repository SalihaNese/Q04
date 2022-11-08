package test.day15_pageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C03_PagesKullanimi {


    /*
    Page classları bir websayfasinda locate etmek istedigimiz
    webElementleri locate edip,sonrasinda ihtiyacimiz oldukca kullanmak icin olusturulur

    pages class'larindaki locate edilen webElementlere erisebilmek icin test class'imizda
    ilgili page classdan bir obje olustururuz
     */


    // amazon anasayfaya gidin
    // Nutella icin arama yapın
    // sonucların nutella icerdigini test edin

    @Test
    public void test1(){
        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();

        // Nutella icin arama yapın
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // sonucların nutella icerdigini test edin

        String actualSonucYazisi = amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

        Driver.closeDriver();
    }
}
