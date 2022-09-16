package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
   public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"navLogon\"]/a")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public WebElement UsarNameKutusu;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement PasswordKutusu;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement LoginButonu2;

    @FindBy(id = "menuHotels")
     public WebElement hotelManagement;
}
