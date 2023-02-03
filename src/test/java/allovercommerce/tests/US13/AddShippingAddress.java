package allovercommerce.tests.US13;
import allovercommerce.pages.HomePage;
import allovercommerce.pages.MyAccountPage;
import allovercommerce.pages.ShippingAddressPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AddShippingAddress {
    /*
    Given
         https://allovercommerce.com/
    When
         User log in as vendor
    And
         user click on Address
    And
        user click on ADD Button under shipping
    And
        User add First name
    And
        User add last name
    And
       User add company name
    And
       User choose country from country drop down
    And
       user add street address
    And
       User enters Zipcode
    And
        User enters city name
    And
        User choose Province from dropdown
    And
        User Clicks on SAVE BUTTON
    And
        User
     */
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
    @Test
    public void testCase02_US13(){
    // user log in as user
    Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));
    homePage.signIn.click();
    homePage.userName.sendKeys(ConfigReader.getProperty("Vendor_email2"));
    homePage.password.sendKeys(ConfigReader.getProperty("Vendor_password2"));
    homePage.logIn.click();
    homePage.signOutButton.click();

//   user click on Address Button
    shippingAddressPage.getAddressesButton.click();

//   user click on ADD Button under shipping
    shippingAddressPage.addButtonShippingAddress.click();

//     User add First name
    ReusableMethods.waitFor(3);
    shippingAddressPage.shippingFirstName.sendKeys("Arci");
//     User add last name
    shippingAddressPage.shippingLastName.sendKeys("France");

//     User add company name
    ReusableMethods.waitFor(3);
    shippingAddressPage.CompanyName.sendKeys("Blue24");

//  User choose country from country drop down
//    JSUtils.clickElementByJS(shippingAddressPage.shippingCountryDropdown);
//    shippingAddressPage.countryInputSection.sendKeys("Turkey"+Keys.ENTER);
//    ReusableMethods.waitFor(5);

       JSUtils.clickElementByJS(shippingAddressPage.shippingCountryDropdown);
     shippingAddressPage.shippingCountryDropdown.sendKeys("Turkey" + Keys.ENTER);
     ReusableMethods.waitFor(2);

      shippingAddressPage.shippingProvince.click();
       shippingAddressPage.provinceInput.sendKeys("Ankara" + Keys.ENTER);
      ReusableMethods.waitFor(6);



//  user add street address
    shippingAddressPage.streetShippingAddress.sendKeys("palace road");

//  user add zipcode
    ReusableMethods.waitFor(3);
    shippingAddressPage.shippingPostCode.sendKeys("KT14PN");

//  user add city
    ReusableMethods.waitFor(2);
    shippingAddressPage.shippingCity.sendKeys("Anta");

//  user add province from drop down
    ReusableMethods.waitFor(2);
    JSUtils.clickElementByJS(shippingAddressPage.shippingProvince);
    shippingAddressPage.provinceInput.sendKeys("Adana"+Keys.ENTER);

//   user clicks on SAVE BUTTON
    shippingAddressPage.saveAddressButton.click();






//  // Registered Users types country/region













}

    }
