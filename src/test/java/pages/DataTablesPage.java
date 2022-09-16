package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"example_wrapper\"]/div[1]/button[1]")
    public WebElement newButonu;

    @FindBy(xpath = "//*[@id=\"DTE_Field_first_name\"]")
    public WebElement FirstNameKutusu;

    @FindBy(xpath = "//*[@id=\"DTE_Field_last_name\"]")
    public WebElement LastNameKutusu;


    @FindBy(xpath = "//*[@id=\"DTE_Field_position\"]")
    public WebElement PositionKutusu;

    @FindBy(xpath = "//*[@id=\"DTE_Field_office\"]")
    public WebElement OfficeKutusu;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extn;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucIlkElement;


}
