package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {

    public VendorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='register_as_vendor']")
    public WebElement vendorSignupOption;

    @FindBy(id = "user_email")
    public WebElement emailInput;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement codeInput;



    @FindBy(id = "passoword")
    public WebElement passwordInput;

    @FindBy(id = "confirm_pwd")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement registerButton;


    @FindBy(xpath = "//span[@class='wcicon-status-completed']")
    public WebElement verificationCodeMessage;

    @FindBy(xpath = "//span[@class='wcicon-status-cancelled']")
    public WebElement passwordTooShortFailureMessage;

    @FindBy(xpath = "//div[.='This Email already exists. Please login to the site and apply as vendor.']")
    public WebElement emailAlreadyExistMessage;

    @FindBy(xpath = "//h2")
    public WebElement myAccountHeader;

    @FindBy(linkText = "Orders")
    public WebElement ordersLink;

    @FindBy(linkText = "Downloads")
    public WebElement downloadsLink;

    @FindBy(linkText = "Addresses")
    public WebElement addressesLink;

    @FindBy(linkText = "Account details")
    public WebElement accountDetailsLink;

    @FindBy(linkText = "Wishlist")
    public WebElement wishlistLink;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy(linkText = "Store Manager")
    public WebElement storeManagerLink;

    @FindBy(linkText = "Support Tickets")
    public WebElement supportTicketsLink;

    @FindBy(linkText = "Followings")
    public WebElement followingsLink;




}
