package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement  aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    //   //US_04 MUSTAFA-EMRE
    //@FindBy(xpath = "//a[@href='/login']")
    //public WebElement loginButton;
    //
    //
    //    @FindBy(xpath="//input[@id='formBasicEmail']")
    //    public WebElement loginEmailBox;
    //
    //
    //    @FindBy(xpath = "//input[@id='formBasicPassword']")
    //    public WebElement loginPasswordBox;
    //
    //    @FindBy(xpath = " //button[@class='btn btn-primary']")
    //    public WebElement loginOnayButton;
    //
    //    @FindBy(xpath ="//button[@id='dropdown-basic-button']")
    //    public WebElement nameDropdownButton;
    //
    //    @FindBy(xpath = "//a[text()='Reservations']")
    //    public WebElement reservationDropdownButton;
    //
    //    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[1]")
    //    public WebElement youtubeIkonu;
    //
    //    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[2]")
    //    public WebElement facebookIkonu;
    //
    //    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[3]")
    //    public WebElement twitterIkonu;
    //
    //
    //    @FindBy(xpath = "(//li[@class='d-none d-md-block'])[4]")
    //    public WebElement instagramIkonu;
    //
    //    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    //    public WebElement homeBaslik;
    //    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    //    public WebElement servicesBaslik;
    //
    //    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    //    public WebElement aboutUsBaslik;
    //
    //    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    //    public WebElement contactBaslik;
    //
    //    @FindBy(xpath = "//a[@class='navbar-brand']")
    //    public WebElement blueRentalcarsLogo;
    //
    //    @FindBy(xpath = "//div[@class='col-7']")
    //    public WebElement callUsBaslik;
    //
    //    @FindBy(xpath = "//img[@src='/assets/img/cars/volvo-s90.png']")
    //    public WebElement degisenAracVolvo;
    //
    //    @FindBy(xpath = "//span[@class='carousel-control-prev-icon']")
    //    public WebElement controlButtonuSol;
    //
    //    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    //    public WebElement controlButtonuSag;
    //
    //    @FindBy(xpath = "(//img[@class='d-block w-100'])[1]")
    //    public WebElement degisenAracAudi;
    //    //
}
