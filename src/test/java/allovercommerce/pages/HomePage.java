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
    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberme")
    public WebElement rememberMe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement useIcon    ;

    @FindBy(xpath = "//input[@type='search'][1]")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='search-name']")
    public WebElement productSearch;


}