package test.day17_smokeTest;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C01_SingletonPattern {

    /*
     singletonpattern bir classtan obje olusturulmasını engelleyen
     veya sinirlandiran bir konseptir
     */

    @Test
    public void test01(){

        /*// amazon anasayfaya gidin

        //Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Tum classlardan yapabildigimiz gibi Driver class'tan da obje olusturabilir
        // ve oradaki class uyelerini kullanabiliriz
        // Boyle bir kullanimda
        Driver class'inda yaptıgımız tercihler
        bypass edilmis olur

        Bu tur kullanimin onune gecebilmek icin Javadan
        singleton pattern konsepti uygulanir

        Driver class'indan obje olusturulmasini engellemek icin

        Driver class'indan obje olusturup,kullanabilmek icin
        Driver() consructor'ina ihtiyac vardir
        Eger bu  consructor'ı erisilmez yaparsak
        kimse consructor'a erisemez ve dolayısıyla
        kimse Driver class'ından obje olusturamaz

        Bunun
         */

        //Driver driver=new Driver();

    }
}
