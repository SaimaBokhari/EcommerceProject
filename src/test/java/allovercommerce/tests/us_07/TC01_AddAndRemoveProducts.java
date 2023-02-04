package allovercommerce.tests.us_07;

import allovercommerce.pages.AllOverCommercePage;
import allovercommerce.pages.ComparePage;
import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TC01_AddAndRemoveProducts {

/*
Given
     https://allovercommerce.com/
When
    user click on  “ALLOVER COMMERCE” logo from My Account page
And
    User search for first product
And
    click on compare icon
And
     back to allcoverpage
And
     click on 2nd Product
And
    click on compare icon
And
     back to allcover
And
     click on 3rd Product
And
    click on compare icon
And
     back to allcover
And
    click on 4th  Product
And
    click on compare icon
And
     back to allcoverpage
then
    verify products are on Compare page

 */
AllOverCommercePage allOverCommercePage = new AllOverCommercePage();
HomePage homePage=new HomePage();
ComparePage comparePage = new ComparePage();
@Test
public void testCase1_Us7(){


Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

// user adds 4 product to compare

    allOverCommercePage.searchBox.click();
   allOverCommercePage.searchBox.sendKeys("Automatic Crusher", Keys.ENTER);
   allOverCommercePage.submitButton.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.automaticCrusher.click();
   allOverCommercePage.compareIcon.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.backToPage.click();
   ReusableMethods.waitFor(2);

   allOverCommercePage.searchBox.sendKeys("Electric Rice-Cooker", Keys.ENTER);
   allOverCommercePage.submitButton.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.electricRiceCooker.click();
   allOverCommercePage.compareIcon.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.backToPage.click();
   ReusableMethods.waitFor(2);

   allOverCommercePage.searchBox.click();
   allOverCommercePage.searchBox.sendKeys("chess",Keys.ENTER);
   allOverCommercePage.submitButton.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.chess.click();
   ReusableMethods.waitFor(2);
   JSUtils.clickElementByJS(allOverCommercePage.compareIcon);
   ReusableMethods.waitFor(2);
   allOverCommercePage.backToPage.click();
   ReusableMethods.waitFor(2);

   allOverCommercePage.searchBox.click();
  allOverCommercePage.searchBox.sendKeys("ASUS",Keys.ENTER);
  allOverCommercePage.submitButton.click();
   ReusableMethods.waitFor(2);
   allOverCommercePage.ASUS.click();
   JSUtils.clickElementByJS(allOverCommercePage.compareIcon);
   ReusableMethods.waitFor(3);

   // user need clicks on START BUTTON
   JSUtils.clickElementByJS(allOverCommercePage.startCompareButton);
   ReusableMethods.waitFor(3);


   // Remove 1 product
    JSUtils.clickElementByJS(allOverCommercePage.removeASUS);
    ReusableMethods.waitFor(3);

// verify
    ReusableMethods.verifyElementNotDisplayed(comparePage.ASUS);








}








}
