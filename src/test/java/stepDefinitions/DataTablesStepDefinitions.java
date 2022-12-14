package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    dataTablesPage.newButonu.click();
    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
    dataTablesPage.FirstNameKutusu.sendKeys(firstname);
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
    dataTablesPage.LastNameKutusu.sendKeys(lastName);
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
    dataTablesPage.PositionKutusu.sendKeys(position);
    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
    dataTablesPage.OfficeKutusu.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
    dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
    dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
    dataTablesPage.create.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
    dataTablesPage.search.sendKeys(firstname);
    }
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isim_bolumunde_oldugunu_test_eder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }


}
