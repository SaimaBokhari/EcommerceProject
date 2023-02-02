package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOverCommercePage {

    public AllOverCommercePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='logo']")
    public WebElement allOverCommerceLogo;


    @FindBy(xpath = "//a[@href='https://allovercommerce.com/urun/asus-x415ea-eb1360w-intel-core-i7-1165g7-islemci-8gb-ram-512gb-ssd-iris-xe-ekran-karti-14-fhd-windows-11-convertible-laptop/']")
    public WebElement producttoCompare;
    @FindBy(xpath= "//a[@data-product_id='14216']")
    public WebElement Compareicon;


    @FindBy(xpath = "//div[@data-thumb='https://allovercommerce.com/wp-content/uploads/2022/09/home-sofa-1-600x675.jpg']")
    public WebElement fourthProductToCompare;

    @FindBy(xpath = "//a[@data-product_id='13222']")
    public WebElement fourthCompareIcon;

    @FindBy(xpath = "//i[@class='w-icon-times-solid']")
    public WebElement deleteIconRemovesProduct;

    @FindBy(xpath = "//a[@data-product_id='17653']")
    public WebElement calculatorCompare;

    @FindBy(xpath = "//a[@data-product_id='14219']")
    public WebElement heybroCompare;

    @FindBy(xpath = "//a[@data-product_id='13221']")
    public WebElement usbCompare;

     @FindBy(xpath = "//a[@data-product_id='14672']")
    public WebElement iphoneCompare;

  @FindBy(xpath = "//a[@data-product_id='15766']")
    public WebElement basketballCompare;

    @FindBy(xpath = "//a[@href='https://allovercommerce.com/wp-content/uploads/2023/01/s1.jpg']")
    public WebElement getMacBookProCompare;

    @FindBy(xpath = "//a[@data-product_id='16777']")
    public WebElement macBookProCompare;


    @FindBy(xpath = "//a[@data-product_id='15709']")
    public WebElement afdgaCompare;


}
