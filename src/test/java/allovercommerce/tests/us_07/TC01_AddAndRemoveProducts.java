package allovercommerce.tests.us_07;

import allovercommerce.pages.AllOverCommercePage;
import allovercommerce.pages.ComparePage;
import allovercommerce.pages.HomePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
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
//  https://allovercommerce.com/
Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));

// user click on  “ALLOVER COMMERCE” icon
allOverCommercePage.allOverCommerceLogo.click();

// click on 1st product compare button
JSUtils.clickElementByJS(allOverCommercePage.producttoCompare);
ReusableMethods.waitFor(2);
// click on compare icon
JSUtils.clickElementByJS(allOverCommercePage.Compareicon);

// back to allCover page
allOverCommercePage.allOverCommerceLogo.click();
ReusableMethods.waitFor(2);

// click on second product
String searchedProduct = ConfigReader.getProperty("search_product");
homePage.searchBox.sendKeys(searchedProduct);
WebElement product = homePage.productSearch;
Assert.assertTrue(product.isDisplayed());
// click to product 2
product.click();
JSUtils.clickElementByJS(allOverCommercePage.calculatorCompare);

// back to allCover page
allOverCommercePage.allOverCommerceLogo.click();
ReusableMethods.waitFor(2);

// search and click on 3rd product
homePage.searchBox.sendKeys(ConfigReader.getProperty("search_product2"));
WebElement product3 = homePage.productSearch;
Assert.assertTrue(product.isDisplayed());
product3.click();
JSUtils.clickElementByJS(allOverCommercePage.heybroCompare);

// back to allCover page
allOverCommercePage.allOverCommerceLogo.click();
ReusableMethods.waitFor(2);

// search and click on 4th product
homePage.searchBox.sendKeys(ConfigReader.getProperty("search_product3"));
WebElement product4 =homePage.productSearch;
Assert.assertTrue(product4.isDisplayed());
JSUtils.clickElementByJS(allOverCommercePage.usbCompare);




// user removes the product
ReusableMethods.waitFor(3);
//comparePage.removeProduct1.click();
JSUtils.clickElementByJS(comparePage.removeProduct1);
ReusableMethods.waitFor(5);
JSUtils.clickElementByJS(comparePage.getCleanAllButton);




// Verify all 4 product


//Driver.closeDriver();
}








}
