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

    @FindBy(partialLinkText = "Addresses")
    public WebElement addressesButton;

    @FindBy(xpath = "(//a[.='Add'])[1]")
    public WebElement addButtonForBillingAddress;

    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(id = "select2-billing_country-container")
    public WebElement billingCountryDropdown;

    @FindBy(id = "billing_address_1")
    public WebElement billingStreetAddress;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "select2-billing_state-container")
    public WebElement billingState;

    @FindBy(id = "billing_postcode")
    public WebElement billingZipcode;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(name = "save_address")
    public WebElement saveBillingAddress;


}