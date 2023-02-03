package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVariableProductPage {

    public AddVariableProductPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='account']")
    public WebElement accountButton;

    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement productsButton;



    @FindBy(xpath = "(add_new_product_dashboard")
    public WebElement addNewProductButton;

    @FindBy(id = "product_type")
    public WebElement productSelectDropdown;

    @FindBy(id = "pro_title")
    public WebElement productTitle;

    //featured img

    @FindBy(id = "featured_img_display")
    public WebElement featuredImage;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement select1FilesButton;

    @FindBy(xpath = "(//*[.='Select'])[3]")
    public WebElement selectButton;

    //gallery img

    @FindBy(id = "(gallery_img_gimage_0_display")
    public WebElement galleryImage;

    @FindBy(id = "(menu-item-upload")
    public WebElement uploadFilesButton;


    @FindBy(id = "(__wp-uploader-id-4")
    public WebElement select2FilesButton;


    @FindBy(xpath = "(//*[.='Add to Gallery'])[8]")
    public WebElement addGalleryButton;


//choose category
    @FindBy(xpath = "(//input[@type='checkbox'])[99]")
    public WebElement shoeCheckbox;

    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement productSubmitButton;


    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributeButton;

    @FindBy(id = "attributes_is_active_1")
    public WebElement colorButtonCheckbox;

    @FindBy(xpath = "(//*[.='Add New'])[3]")
    public WebElement addNewcolorButton;

    //driver switch to alert send keys accept








    //@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    //public WebElement colorDropdown;


    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeButton;

    @FindBy(xpath = "(//input[@class='select2-search__field'])[3]")
    public WebElement sizeDropdown;

    @FindBy(id = "attributes_name_3")
    public WebElement attributeNameInput;

    @FindBy(xpath = "//button[@class='button wcfm_add_attribute']")
    public WebElement addAttributeButton;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[6]")
    public WebElement variationsButton;


}
