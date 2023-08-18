package education.stepDefinition;

import education.pages.AmazonPages;
import education.utilities.ConfigReader;
import education.utilities.Driver;
import education.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class AmazonStepDefinition {
    AmazonPages amazonPages = new AmazonPages();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.bekle(2);
    }

    @Then("kullanici arama kutusunda iphone aratir")
    public void kullaniciAramaKutusundaIphoneAratir() {
        amazonPages.aramaKutusu.sendKeys("iphone",Keys.ENTER);
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici arama kutusunda samsung aratir")
    public void kullaniciAramaKutusundaSamsungAratir() {
        amazonPages.aramaKutusu.sendKeys("samsug",Keys.ENTER);

    }
}
