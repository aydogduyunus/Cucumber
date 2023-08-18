package education.stepDefinition;

import education.pages.TechproPages;
import education.utilities.ConfigReader;
import education.utilities.Driver;
import education.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TechproStepDefinition {

    TechproPages techproPages = new TechproPages();

    @Given("Kullanici techproEducation sayfasina gider")
    public void kullaniciTechproEducationSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @Then("arama kutusuna qa aratir")
    public void aramaKutusunaQaAratir() {
    techproPages.aramaKutusu.sendKeys("qa", Keys.ENTER);
        ReusableMethods.bekle(2);
    }



    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {
        techproPages.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(2);


    }

    @But("cikan dropdown menuden mobile developer secenegini tiklar")
    public void cikanDropdownMenudenMobileDeveloperSeceneginiTiklar() {
        techproPages.mobileDevLink.click();

    }

    @And("basligin Mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techproPages.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden free java secenegini tiklar")
    public void cikanDropdownMenudenFreeJavaSeceneginiTiklar() {
        techproPages.freeJavaLink.click();
    }

    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String str) {
        Driver.getDriver().get(str);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techproPages.aramaKutusu.sendKeys(str);
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }
}
