package allovercommerce.tests.us_09;

import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TC_01_SignUp {
    /*
When
    User goes to "https://allovercommerce.com
And
    User clicks on the Register link
And
   User enters Username
And
   User enters email address
And
   User enters password
And
   User clicks on “privacy policy” checkbox
And
   User clicks on “Sign Up” Option
Then
   Verify that user is already signed up

     */

    HomePage homePage= new HomePage();


    @Test
    public void testCase_01(){

        //    User goes to "https://allovercommerce.com
        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

        //    User clicks on the Register link.
        homePage.registerOption.click();

        // User enters Username
        homePage.reg_username.sendKeys(ConfigReader.getProperty("vendor_username"));
        ReusableMethods.waitFor(1);

        //   User enters email address
        homePage.reg_email.sendKeys(ConfigReader.getProperty("vendor_email"));
        ReusableMethods.waitFor(1);

        //   User enters password
        homePage.reg_password.sendKeys(ConfigReader.getProperty("vendor_password"));
        ReusableMethods.waitFor(1);

        //   User clicks on “privacy policy” checkbox
        homePage.registerPolicy.click();
        ReusableMethods.waitFor(1);

        //   User clicks on “Sign Up” Option
        homePage.signupButton.click();
        ReusableMethods.waitFor(5);

        //   Verify that user is already signed up
        assertTrue(homePage.accountAlreadyExistMessage.isDisplayed());

        // Close the application
        Driver.closeDriver();



    }
}
