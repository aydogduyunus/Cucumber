package education.stepDefinition;

import education.pages.BlueRentalPages;
import education.utilities.ConfigReader;
import education.utilities.Driver;
import education.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class BlueRentalStepDefinition {
    BlueRentalPages blueRentalPages = new BlueRentalPages();

    @Given("kullanici {string} sayfasina properties ile gider")
    public void kullaniciSayfasinaPropertiesIleGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty(str));

    }

    @When("kullanici login butonuna gider")
    public void kullaniciLoginButonunaGider() {
    blueRentalPages.loginButon.click();
    }

    @Then("Kullanici bilgilerini girer {string}, {string}")
    public void kullaniciBilgileriniGirer(String email, String password) {
        blueRentalPages.email.sendKeys(email,Keys.TAB,password, Keys.ENTER);
    }

    @Then("kullanici giris yapildigini dogrular")
    public void kullaniciGirisYapildiginiDogrular() {
        Assert.assertTrue(blueRentalPages.girisDogrulama.isDisplayed());
    }
}
