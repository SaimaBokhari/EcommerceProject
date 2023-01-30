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
    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInSection;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberme")
    public WebElement rememberMe;

    @FindBy(name = "login")
    public WebElement signInButton;

    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement manIcon;

    @FindBy(id = "yith-wcwl-popup-message")
    public WebElement popUp;

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(id = "reg_username")
    public WebElement usernameReg;

    @FindBy(id = "reg_email")
    public WebElement emailReg;

    @FindBy(id = "reg_password")
    public WebElement passwordReg;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUp;

    @FindBy(id = "register-policy")
    public WebElement checkBox;

    @FindBy(partialLinkText ="Sign Out")
    public WebElement signOut;






}
