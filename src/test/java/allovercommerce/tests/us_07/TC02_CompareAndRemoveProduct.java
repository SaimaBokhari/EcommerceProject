package allovercommerce.tests.us_07;

import allovercommerce.pages.AllOverCommercePage;
import allovercommerce.pages.ComparePage;
import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TC02_CompareAndRemoveProduct {
/*
Given
     https://allovercommerce.com/
When
       User click on Search box and search product
AND    add submitButton and select 1st product
AND    clickS on compare icon and adds first product
AND    clickS on compare icon on product
AND    User click on Search box again and search for 2nd product
AND    user clicks on submitButton and select 2nd product
AND    clickS on compare icon on 2nd product
AND    User click on Search box again and search for 3rd product
AND    user clicks on submitButton and select 3rd product
AND    clickS on compare icon on 3rd product
AND    User click on Search box again and search for fourth product
AND    user clicks on submitButton and select  fourth product
AND    clickS on compare icon on  fourth product
AND    user should be able to click on START COMPARE
AND    user should be able to Remove one of the product
THEN   VERIFY 2 product has been removed
 */
    AllOverCommercePage allOverCommercePage = new AllOverCommercePage();
    ComparePage comparePage = new ComparePage();

@Test
    public void TestCase02_Us7(){
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

    JSUtils.clickElementByJS(allOverCommercePage.removeChess);
    ReusableMethods.waitFor(3);
  // verify product has been removed

    String expectedlUrl = "https://allovercommerce.com/compare-2/";
    Driver.getDriver().getCurrentUrl();
    String actualUrl = Driver.getDriver().getCurrentUrl();
    ReusableMethods.waitFor(3);
    assertEquals(expectedlUrl,actualUrl);


}


}
