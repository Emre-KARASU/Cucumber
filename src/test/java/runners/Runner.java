package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre",
        dryRun = false
        //tags = "@ikisi or @java", ikisini birlikte calistirmak icin kullanilir

)
public class Runner {

    /*
    Bir frameworkte bir tek Runner Class yeterli olabilir
    Runnner class'in da class body'sinde hic bir sey olmaz
    Runner Class'imizi onemli yapan 2 adet annotion vardir
    @RunWith(Cucumber.class) notasyonu Runner class'imiza calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuz de JUnit kullanmayi tercih ederiz

    features : Runner clasinin  feature dosyalarini nereden bulacagini tarif eder
    glue : stepdefinitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calsitirmak istiyorsak onu belli eder

    dryRun : iki secenek vardir
    dryRun=true; yazdigimiz da testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun=false; yazdigimiz da testlerimizi calistirir.

     */
}
