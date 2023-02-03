package allovercommerce.tests.US_17;

import allovercommerce.pages.AddVariableProductPage;
import allovercommerce.pages.LoginPage;
import allovercommerce.pages.ShoppingPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddVariableProductTest {

    Faker faker=new Faker();
    LoginPage loginPage=new LoginPage();
    ShoppingPage shoppingPage=new ShoppingPage();
    AddVariableProductPage addVaraiableProductPage=new AddVariableProductPage();

    /*
1	Variable Product should be selectable.

2   The steps of US14 and US15 should be done succesfully.

3	Attributes color and size should be selectable according to the product.

4	User should be able to add New color and size.

5	By clicking Variations, Attributes should be visible.

6	User should be able to fill Product attributes according to the Attributes that added before. (product info should be selectable)
*/
    @Test
    public void addVariableProdTest(){

        //Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));
        Driver.getDriver().get("https://allovercommerce.com/");
        ReusableMethods.waitFor(5);

        //Click on Sign In Button
        loginPage.signInIcon.click();
        ReusableMethods.waitFor(4);

        //enter email as username in username input
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));

        //enter password in password input
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));

        //click on Sign In submit button
        loginPage.signInSubmitButton.click();
        ReusableMethods.waitFor(4);

        //click on Cart Button to go My Account Page
        JSUtils.clickElementByJS(shoppingPage.accountButton);
        ReusableMethods.waitFor(2);

        //click on Store Manager
        JSUtils.clickElementByJS(addVaraiableProductPage.storeManagerButton);

        //Click on Product button
        JSUtils.clickElementByJS(addVaraiableProductPage.productsButton);

        Driver.getDriver().switchTo().alert().sendKeys("shoe desc");

        // Click on Add New product button
        JSUtils.clickElementByJS(addVaraiableProductPage.addNewProductButton);


        //switch to alert and send keys and accept it
//        ReusableMethods.waitFor(3);
//       Driver.getDriver().switchTo().alert().sendKeys("shoe desc");
//       ReusableMethods.waitFor(3);

//        //click OK,
//        Driver.getDriver().switchTo().alert().accept();

        // Select variable product from product dropdown
        Select selectProduct=new Select(addVaraiableProductPage.productSelectDropdown);
        selectProduct.selectByVisibleText("Variable Product");

        //enter Product Title in product title field(shoe)
        addVaraiableProductPage.productTitle.sendKeys("shoe");

        //Click on featured image
        JSUtils.clickElementByJS(addVaraiableProductPage.featuredImage);

        //click on "select files" button to choose the image
        JSUtils.clickElementByJS(addVaraiableProductPage.select1FilesButton);

        //click on "select files"to upload an image
        String userHOME = System.getProperty("user.home");
        String pathOfFile = userHOME + "/Desktop/shoe.jpeg";
        addVaraiableProductPage.selectButton.sendKeys(pathOfFile);


        //click on gallery image
        JSUtils.clickElementByJS(addVaraiableProductPage.galleryImage);

        JSUtils.clickElementByJS(addVaraiableProductPage.uploadFilesButton);

        JSUtils.clickElementByJS(addVaraiableProductPage.select2FilesButton);

        //click on "add to gallery" button to choose an image
        //addVaraiableProductPage.galleryImgUploadButton.sendKeys(pathOfFile);;

//        //click on categories/shoes checkbox
//        JSUtils.clickElementByJS(addVaraiableProductPage.shoeCheckbox);
//
//        //click on submit button
//        JSUtils.clickElementByJS(addVaraiableProductPage.productSubmitButton);
//
//        //click on attributes
//        JSUtils.clickElementByJS(addVaraiableProductPage.attributeButton);

        //click on color checkbox
        //addVaraiableProductPage.

        //click on add new button


        //switch to alert, send the color and accept the alert

        //click on size checkbox

        //click on add new button

        //switch to alert, send the size and accept the alert



//        //fill/select the attribute name input
//        Select selectSize=new Select(addVaraiableProductPage.sizeDropdown);
//        selectSize.selectByIndex(1);
//
//        //enter new attribute name in name input
//        addVaraiableProductPage.attributeNameInput.sendKeys("apple");
//
//        //click add button to add attribute
//        addVaraiableProductPage.addAttributeButton.click();
//        ReusableMethods.waitFor(3);
//
//        //click on Variations
//        addVaraiableProductPage.variationsButton.click();
//        ReusableMethods.waitFor(3);





    }
}

