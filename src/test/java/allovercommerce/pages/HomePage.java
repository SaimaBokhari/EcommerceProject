package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){  // Constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locate elements by using any locator
    @FindBy(partialLinkText = "Sign In")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberme")
    public WebElement rememberMe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement useIcon    ;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public  WebElement userIcon;

    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@class='register_as_vendor']")
    public WebElement signUpAsAVendor;


}