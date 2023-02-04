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






   // Handle the small window pops up






}



























}
