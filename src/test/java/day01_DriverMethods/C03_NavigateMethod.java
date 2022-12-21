package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //TechproEducation sayfasina gidelim
        Thread.sleep(3000); //.try denerise try catch icine alir
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasina dönelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasina geri döner

        //Tekrar hepsiburada sayfasina gildeim
        Thread.sleep(3000);
        driver.navigate().forward(); //Techpro ya gider

        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayi kapatalim.
        driver.close();



    }
}
