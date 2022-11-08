package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@value='1'])[3]")
    public WebElement cerezler;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement facebookEmailKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement facebookPasswordKutusu;
                                                                    ////button[@title='Sadece temel çerezlere izin ver']
                                                                //cerezlerin xpathı
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girilemediYaziElementi;

    @FindBy(xpath = "//button[@name=‘login’]")
    public WebElement girisButon;

}
