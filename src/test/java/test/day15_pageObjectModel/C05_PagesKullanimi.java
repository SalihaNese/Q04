package test.day15_pageObjectModel;

import Utilities.Driver;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;

public class C05_PagesKullanimi {

       // 1 - https://www.facebook.com/ adresine gidin
      // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
      //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    // 4- Basarili giris yapilamadigini test edin

    @Test
    public void test01(){

        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker= new Faker();
        FacebookPage facebookPage = new FacebookPage();


        facebookPage.facebookEmailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.facebookPasswordKutusu.sendKeys(faker.internet().password());
        facebookPage.girisButon.click();
        // 4- Basarili giris yapilamadigini test edin




        ReusableMethods.bekle(5);
    }
}
