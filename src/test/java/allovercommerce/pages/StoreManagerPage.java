package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPage {
    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']/a")
    public WebElement products;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']/span")
    public WebElement productsAddNew;

}
