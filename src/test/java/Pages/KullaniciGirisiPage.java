package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class KullaniciGirisiPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    By emailTextbox = By.id("Email");
    By sifreTextbox = By.id("myInput");
    By girisButton = By.id("kt_login_signin_submit");
    public KullaniciGirisiPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);
    }

    public void girisPage() {
        driver.get("https://www.infinitygelisim.com/");
    }

    public void emailYanlis() {
        driver.findElement(emailTextbox).sendKeys("betulgbuz@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void sifreYanlis() {
        driver.findElement(sifreTextbox).sendKeys("123456");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void girisButton() {
        driver.findElement(girisButton).click();
    }

    public void emailDogru() {
        driver.findElement(emailTextbox).sendKeys("betulguurbuz@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void sifreDogru() {
        driver.findElement(sifreTextbox).sendKeys("123456");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}

// Sisteme ait gercek bir kullanici adi ve sifre bilgim olmadigindan PozitiveTest adimlarindan sonra sayfanin yonlendirme kontrol testi yazilmamistir.
// PozitiveTest senaryosunun dogru sonuc vermesi için gercek kullanici bilgilerine ihtiyac vardır.
// Gercek verilerle test yapilirken asagidaki kodlarin eklenmesi gerekir.
// WebElement girisKontrol = driver.findElement(girisTitle);
// String girisTitleText = girisKontrol.getText();
// assertEquals(girisTitleText, "Sayfanin title bilgisi");
