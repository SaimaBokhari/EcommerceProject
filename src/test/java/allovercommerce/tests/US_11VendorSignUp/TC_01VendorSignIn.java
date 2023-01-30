package allovercommerce.tests.US_11VendorSignUp;

import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_01VendorSignIn {

    /*

    Given
        User goes to "https://allovercommerce.com
     When
          User clicks on Sign In link
       And
           User enters email address into "email" input
        And
            User enters password into "email" input
          And
            User clicks on "Sign In" Button
          Then
             Verify that user Signed In successfully
     */

    @Test
    public void vendorSignIn() {

        //    User goes to "https://allovercommerce.com
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

        //    User clicks on Sign In link
        HomePage homePage = new HomePage();
        homePage.signInSection.click();

        //   User enters email address into "email" input
        homePage.emailReg.sendKeys(ConfigReader.getProperty("vendor_email"));
        ReusableMethods.waitForVisibility(  homePage.signInSection,20);

        //   User enters password into "email" input
        homePage.passwordReg.sendKeys(ConfigReader.getProperty("vendor_password"));
        ReusableMethods.waitFor(1);


        //   User clicks on "Sign In" Button
        homePage.signInButton.click();
        ReusableMethods.waitFor(5);

        //   Verify that user is signed up successfully
        Assert.assertTrue(homePage.signOut.isDisplayed());
    }

    @AfterMethod
    public void closeDriver1(){
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
}
