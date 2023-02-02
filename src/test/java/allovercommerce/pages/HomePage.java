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

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userName;


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberme")
    public WebElement rememberMe;


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




    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement useIcon    ;

    @FindBy(xpath = "//input[@type='search'][1]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='search-name']")
    public WebElement productSearch;

    // Locate elements for signing up/registration


    @FindBy(xpath = "//a[.='Register']")
    public WebElement registerOption;

    @FindBy(id = "reg_username")
    public WebElement reg_username;

    @FindBy(id = "reg_email")
    public WebElement reg_email;

    @FindBy(id = "reg_password")
    public WebElement reg_password;

    @FindBy(xpath = "//a[@class='register_as_vendor']")
    public WebElement vendorSignupOption;

    @FindBy(id = "register-policy")
    public WebElement registerPolicy;

    @FindBy(name = "register")
    public WebElement signupButton;

    @FindBy(xpath = "//a[.='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement confirmLogOutButton;

    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement accountAlreadyExistMessage;


    // Locate elements for "BECOME A VENDOR"

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeAVendorOption;


    // Locate elements for SIGN IN








    @FindBy(id = "rememberme")
    public WebElement rememberMeCheckbox;



    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement userIcon;

}