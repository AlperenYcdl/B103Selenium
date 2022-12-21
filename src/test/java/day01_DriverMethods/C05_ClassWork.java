package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ClassWork {

    /*
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods


    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
    */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //1- Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //2- Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : " + driver.getTitle());

        //3- Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")) { //büyük kücük harf duyarli
            System.out.println("-Title testi PASSED");
        } else System.out.println("-Title testi FAILED");

        //4- Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i: " + driver.getCurrentUrl());

        //5- Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")) {
            System.out.println("-Url Testi PASSED");
        } else System.out.println("-Url Testi FAILED");

        //6- Sayfa handle degerini yazdirin
        System.out.println("Window Handle Değeri : " + driver.getWindowHandle());

        //7- Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")) {
            System.out.println("-Source Code Testi PASSED");
        } else System.out.println("-Source Code Testi FAILED");

        //8- Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak için close() methodu kullanırız


    }

}
