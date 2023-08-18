package education.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import education.utilities.Driver;

public class TechproPages {
    public TechproPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='form-input']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//span[text()='Mobile Developer']")
    public WebElement mobileDevLink;

    @FindBy(xpath = "(//span[text()='Free Java'])[1]")
    public WebElement freeJavaLink;
}