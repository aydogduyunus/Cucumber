package education.stepDefinition;

import education.pages.GooglePages;
import education.utilities.ConfigReader;
import education.utilities.Driver;
import education.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.stream.IntStream;

public class GoogleStepDefinition {
    GooglePages googlePages = new GooglePages();

    @Given("Kullanici {string} sayfasina properties ile gider")
    public void kullaniciSayfasinaPropertiesIleGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty(str));
    }

    @Then("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
        googlePages.aramaKutusu.sendKeys(ConfigReader.getProperty(str), Keys.ENTER);
    }

    @And("kullanici sayfa basliginin {string} icerdigini test eder")
    public void kullaniciSayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }

    @Then("kullanici google arama kutusunda {string} aratir")
    public void kullaniciGoogleAramaKutusundaAratir(String str) {
        googlePages.aramaKutusu.sendKeys(str,Keys.ENTER);

    }

    @And("kullanici sayfa basliginin {string} icerdigini test etti")
    public void kullaniciSayfaBasligininIcerdiginiTestEtti(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @Then("kullanici google arama kutusunda {string} ile propertiesden aratir")
    public void kullaniciGoogleAramaKutusundaIlePropertiesdenAratir(String str) {
        googlePages.aramaKutusu.sendKeys(ConfigReader.getProperty(str),Keys.ENTER);
    }

    @Then("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {
        System.out.println(data.asList());
        for (int i = 1; i < data.asList().size(); i++) {
            googlePages.aramaKutusu.sendKeys(data.asList().get(i), Keys.ENTER);
            ReusableMethods.bekle(2);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            ReusableMethods.bekle(2);
            googlePages.aramaKutusu.clear();
        }

    }
}
