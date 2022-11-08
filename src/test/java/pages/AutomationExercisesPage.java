package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisesPage {

    public AutomationExercisesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   /* @FindBy(linkText = "//a[@href='/login']")  // //a[@href='/login']
    public WebElement signUpLinki;  // xpahti aldıktan sonra kaydetmeliyız

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginAccountElementi;

    @FindBy(xpath = "(//Input[@name='email'])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath = " (//Input[@name='password'])[1])")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//button[text()='login']")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text(='Logged in as ']")
    public WebElement loggedinAs;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = " //*[text()='Account Deleted!']")
    public WebElement accountDeletedLocatıon;

    */

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginAccountElementi;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinAs;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy (xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeletedlocation;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement newUserName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement newEmailAdress;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement alreadyExist;

}






