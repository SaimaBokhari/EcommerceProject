package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOverCommercePage {

    public AllOverCommercePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//i[@class='w-icon-times-solid']")
    public WebElement deleteIconRemovesProduct;


  @FindBy(xpath = "//a[@data-product_id='15766']")
    public WebElement basketballCompare;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


    @FindBy(xpath ="//*[@id='product-13226']/div[2]/div/h1")
    public WebElement electricRiceCooker;

    @FindBy(xpath ="//*[@id='product-14216']/div[2]/div/h1")
    public WebElement ASUS;

    @FindBy(xpath ="//*[@id='product-19895']/div[2]/div/h1")
    public WebElement chess;

    @FindBy(xpath ="//*[@id='product-13229']/div[2]/div/h1")
    public WebElement automaticCrusher;

  @FindBy(xpath ="//*[@id='product-17653']/div[2]/div/h1")
    public WebElement calculator;



    @FindBy(xpath ="//*[@class='compare btn-product-icon']")
    public WebElement compareIcon;
    @FindBy(xpath ="/html/body/div[2]/div[4]")
    public WebElement backToPage;

    @FindBy(xpath ="/html/body/div[2]/div[3]/div/a[2]")
    public WebElement startCompareButton;


    @FindBy(xpath = "//a[@data-product_id='14000']")
    public WebElement remove_14000;

    @FindBy(xpath = "//a[@data-product_id='14216']")
    public WebElement removeASUS;

  @FindBy(xpath = "//a[@data-product_id='19895']")
  public WebElement removeChess;

  @FindBy(xpath = "//mark[.='4']")
  public WebElement fourProducts;

}
