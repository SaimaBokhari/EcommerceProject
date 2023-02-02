package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(){  // Constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locate elements by using any locator

    @FindBy(xpath = "//span[@class='icon-box-icon icon-addresses']")
    public WebElement addressSection;

    @FindBy(xpath = "(//i[@class='w-icon-long-arrow-right'])[3]")
    public WebElement addButtonUnderShipping;

    @FindBy(id = "shipping_first_name")
    public WebElement shippingFirstName;

    @FindBy(id = "shipping_last_name")
    public WebElement shippingLastName;

    @FindBy(xpath = "(//span[@class='select2-selection__placeholder'])[1]")
    public WebElement shippingCountry;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement inputSection;

    @FindBy(id = "shipping_address_1")
    public WebElement shippingStreetAddress;

    @FindBy(id = "shipping_city")
    public WebElement shippingCity;

    @FindBy(xpath = "//span[@class='select2-selection__placeholder']")
    public WebElement shippingProvince;

    @FindBy(id = "shipping_postcode")
    public WebElement shippingPostCode;

    @FindBy(name = "save_address")
    public WebElement saveAddressButton;

    @FindBy(linkText = "Store Manager")
    public WebElement storeManager;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement inputSection2;

}
