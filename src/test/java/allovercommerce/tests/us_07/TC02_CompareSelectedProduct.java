package allovercommerce.tests.us_07;

import allovercommerce.pages.AllOverCommercePage;
import allovercommerce.pages.ComparePage;
import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_CompareSelectedProduct {
/*
Given
    https://allovercommerce.com/
When
    user click on  “ALLOVER COMMERCE” logo from My Account page
And
    click on 1st Product
And
    click on compare icon
And
     back to allcoverpage
And
     click on 2nd Product
And
    click on compare icon
And
     back to allcoverpage
And
    click on START COMPARE! button
Then
    Verify product page is displayed
 */

    AllOverCommercePage allOverCommercePage = new AllOverCommercePage();
    ComparePage comparePage = new ComparePage();
    HomePage homePage = new HomePage();
@Test
    public void TestCase02_Us7(){
    Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

    // click on alloverCompare Logo
    allOverCommercePage.allOverCommerceLogo.click();

    // search and click to add first pruduct
    String searchedProduct = ConfigReader.getProperty("search_product5");
    homePage.searchBox.sendKeys(searchedProduct);
   WebElement product5 = homePage.productSearch;
    Assert.assertTrue(product5.isDisplayed());
    product5.click();
    // add to compare page
  ReusableMethods.waitFor(3);
    JSUtils.clickElementByJS(allOverCommercePage.basketballCompare);

    // back to allCover page
    allOverCommercePage.allOverCommerceLogo.click();
    ReusableMethods.waitFor(2);

    homePage.searchBox.sendKeys(ConfigReader.getProperty("search_product6"));
   WebElement product6 =  homePage.productSearch;
   Assert.assertTrue(product6.isDisplayed());
   product6.click();
   JSUtils.clickElementByJS(allOverCommercePage.afdgaCompare);


   // Handle the small window pops up

    Driver.getDriver().manage().window();
    comparePage.startCompareButton.click();





}



























}