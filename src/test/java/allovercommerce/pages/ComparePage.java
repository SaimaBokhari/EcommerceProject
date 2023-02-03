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

//   @FindBy(xpath= "//a[@class='compare-clean']")
//    public WebElement cleanButton;

  @FindBy(xpath = "(//a[text()='Clean All'])[2]")
    public WebElement getCleanAllButton;

    @FindBy(xpath = "//*[@class='container slider-relative']")
    public WebElement containerBox;

    @FindBy(xpath = "//*[@class='container slider-relative']")
    public WebElement removeProduct1;

    @FindBy(linkText = "Start Compare !")
    public WebElement startCompareButton;



}
