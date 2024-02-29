package StepDefinitions;

import Pages.KullaniciGirisiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class KullaniciGirisiStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    KullaniciGirisiPage kullaniciGirisiPage = new KullaniciGirisiPage(driver);

    @Given("Kullanici giris sayfasindadir")
    public void kullaniciGirisSayfasindadir() {
        kullaniciGirisiPage.girisPage();
    }

    @Given("Kullanici adini yanlis yazar")
    public void kullaniciAdiniYanlisYazar() {
        kullaniciGirisiPage.emailYanlis();
    }

    @Given("Sifresini yazar")
    public void sifresiniYazar() {
        kullaniciGirisiPage.sifreYanlis();
    }

    @Then("Login butonuna tiklar")
    public void loginButonunaTiklar() {
        kullaniciGirisiPage.girisButton();
    }

    @Given("Kullanici adini dogru yazar")
    public void kullaniciAdiniDogruYazar() {
        kullaniciGirisiPage.emailDogru();
    }

    @Given("Sifresini dogru yazar")
    public void sifresiniDogruYazar() {
        kullaniciGirisiPage.sifreDogru();
    }
}
