package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_MethodMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //1- Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //2- Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = " + driver.manage().window().getSize());

        //3- Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //4- simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //5- Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = " + driver.manage().window().getSize());

        //6- Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //7-Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = " + driver.manage().window().getSize());

        //8-Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
