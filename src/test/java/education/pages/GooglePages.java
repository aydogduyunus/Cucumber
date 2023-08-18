package education.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import education.utilities.Driver;

import java.util.List;

public class GooglePages {
    public GooglePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='APjFqb']")
    public WebElement aramaKutusu;

    //@FindBy(xpath = "//*[@id='APjFqb']")
    // public List<WebElement> urunler;//ürünleri tek tek sıralama ya da tıklama gibi durumlarda liste atmalıyız locati





}






