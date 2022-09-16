package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {

    HMCPage HMCPage=new HMCPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        HMCPage.loginButonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        HMCPage.UsarNameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        HMCPage.PasswordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        HMCPage.LoginButonu2.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(HMCPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        HMCPage.PasswordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigi test eder")
    public void sayfayaGirisYapilamadigiTestEder() {
        Assert.assertTrue(HMCPage.LoginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        HMCPage.UsarNameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }
}
