package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alperycdl/Documents/selenium libraries/driver/chromedriver");

        /*
        En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
        webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
        method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
        */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
}


