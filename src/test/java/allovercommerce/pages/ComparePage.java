package allovercommerce.pages;

import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage {
    public ComparePage(){
        Driver.getDriver().get(ConfigReader.getProperty("ecommerce_url"));
    }

   @FindBy(xpath = "//i[@class='w-icon-times-solid']")
   public WebElement deleteIconRemovesProduct;

    @FindBy(xpath = "//div[@class='compare-popup show']")
   public WebElement compareProductsExist;

    @FindBy(xpath = "(//*[@class='compare-clean'])")
  public WebElement cleanAllButton;

   //
   //@FindBy(xpath = "(//*[.='Clean All'])[3]")


  @FindBy(xpath = "(//a[text()='Clean All'])[2]")
    public WebElement getCleanAllButton;

    @FindBy(xpath = "//a[@data-product_id='13229']")
    public WebElement remove_13229;


    @FindBy(xpath = "//a[@data-product_id='14000']")
    public WebElement remove_14000;


    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath ="//*[@id='product-17653']/div[2]/div/h1")
    public WebElement calculator;

    @FindBy(xpath ="//*[@class='compare btn-product-icon']")
    public WebElement compareIcon;

    @FindBy(xpath ="//*[@id='product-14216']/div[2]/div/h1")
    public WebElement ASUS;


}
