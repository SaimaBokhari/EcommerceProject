package allovercommerce.tests.us_03;

import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TC_02_Signin {

     /*
Given
     User goes to "https://allovercommerce.com/”
And
    User is registered
And
    Clicks on “Sign In” option
And
    User enters username or email address
And
    User enters password
And
   User clicks on "Remember Me" button
And
   Clicks on "Sign In" button
Then
    Verify User has successfully signed in

    */

    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    String reg_username = faker.name().username();
    String reg_email = faker.internet().emailAddress();
    String reg_password = faker.internet().password(1,8);

    public void signUp() {
        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));
        ReusableMethods.waitFor(1);  // Hard wait
        homePage.registerOption.click();
        ReusableMethods.waitFor(1);
        homePage.reg_username.sendKeys(reg_username);
        ReusableMethods.waitFor(1);
        homePage.reg_email.sendKeys(reg_email);
        ReusableMethods.waitFor(1);
        homePage.reg_password.sendKeys(reg_password);
        ReusableMethods.waitFor(1);
        homePage.registerPolicy.click();
        ReusableMethods.waitFor(1);
        homePage.signupButton.click();
    }


    @Test
    public void test01(){
        //     User goes to "https://allovercommerce.com/”
        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

        //  Calls "Sign Up" method from SignUp Class
        signUp();
        homePage.signOutButton.click();
        homePage.confirmLogOutButton.click();

        //    User enters username or email address
        homePage.userName.sendKeys(reg_username);
        ReusableMethods.waitFor(1);
        //    User enters password
        homePage.password.sendKeys(reg_password);
        ReusableMethods.waitFor(1);
        //   User clicks on "Remember Me" button
        JSUtils.clickElementByJS(homePage.rememberMeCheckbox);

        //   Clicks on "Sign In" button
        JSUtils.clickElementByJS(homePage.signInSubmitButton);
        ReusableMethods.waitFor(1);

        //Verify User has successfully signed in

    }
}
