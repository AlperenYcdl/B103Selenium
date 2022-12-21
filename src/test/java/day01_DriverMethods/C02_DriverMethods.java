package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();// Bos bir browser açtık

        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz

        System.out.println("Sayfa Başlığı : " + driver.getTitle()); // Sitenin basligini verir; Amazon.com. Spend less. Smile more.

        System.out.println("Sayfa Url'i : " + driver.getCurrentUrl()); // Sayfa Url ini verir

        //System.out.println(driver.getPageSource()); // Sayfanin kaynak kodlarini string olarak verir
        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir,
        //Biz bu hash değerlerini bir string'e atayıp pencereler arası geçiş yapabiliriz.


    }
}
