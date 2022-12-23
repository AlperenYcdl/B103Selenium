package day02_DriverMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Acilan browser'i tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//gecisleri bekletmek icin

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama sonuc yazisi : " + aramaSonucYazisi.get(0).getText());

        //arama sonuc sayisini console a yazdiriniz
        String[] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuc sayisi : " + sonucSayisi[0]); //yukarida boldu ve 0 ci indexi verdi

        //Sonuc sayisini LAMBDA ile yazdiriniz
        Arrays.stream(aramaSonucYazisi.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE=driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();

    }

}
