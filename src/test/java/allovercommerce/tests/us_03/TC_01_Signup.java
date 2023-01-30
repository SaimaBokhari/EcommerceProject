package allovercommerce.tests.us_03;

import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TC_01_Signup {
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
    public void test01() {
        // Calls for Sign Uo method
        signUp();

        // Verify that user is signed up
        // Close the application
        Driver.closeDriver();


    }
}
