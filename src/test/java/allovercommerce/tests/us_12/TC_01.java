package allovercommerce.tests.us_12;

import allovercommerce.pages.HomePage;
import allovercommerce.pages.MyAccountPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_01 {

    HomePage homePage;

    MyAccountPage myAccountPage;



    @Test
    public void US12_TestCase01SingInVendor() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

        homePage = new HomePage();

        myAccountPage = new MyAccountPage();

        Actions actions = new Actions(Driver.getDriver());


        homePage.loginLink.click();
        homePage.nameField.sendKeys(ConfigReader.getProperty("nameVendor"));
        homePage.passField.sendKeys(ConfigReader.getProperty("passwordVendor"));
        homePage.loginButton.submit();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));

        JSUtils.scrollDownByJS();
        JSUtils.clickElementByJS(homePage.myAccountLink);
        myAccountPage.addressesLink.click();
        myAccountPage.addBillingAddress.click();
        myAccountPage.firstName.clear();
        myAccountPage.firstName.sendKeys("Kevin");
        myAccountPage.lastName.clear();
        myAccountPage.lastName.sendKeys("West");

        Select select = new Select(myAccountPage.countryRegion);
        select.selectByVisibleText("United States (US)");
        myAccountPage.streetAddress.clear();
        myAccountPage.streetAddress.sendKeys("World Way 151");
        myAccountPage.townCity.clear();
        myAccountPage.townCity.sendKeys("Los Angeles");
        Select select1 = new Select(myAccountPage.stateUS);
        select1.selectByVisibleText("California");
        myAccountPage.zipCode.clear();
        myAccountPage.zipCode.sendKeys("90001");
        myAccountPage.phoneNumber.clear();
        myAccountPage.phoneNumber.sendKeys("+1202555155");
        Assert.assertEquals(myAccountPage.vendorEmail.getAttribute("value"), "vendoremail01@abv.bg");
        JSUtils.clickElementByJS(myAccountPage.saveAddress);
        Assert.assertEquals(myAccountPage.savedAddressField.getText(), "World Way 151");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}




