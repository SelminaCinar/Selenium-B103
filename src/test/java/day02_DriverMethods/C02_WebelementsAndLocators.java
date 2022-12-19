package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_WebelementsAndLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Search bolumunu locate edelim
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Search bolumunde iphone aratalim
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir webelementi(Web sayfasindaki her bir buton yada text/yazi) locate(konumunu belirleme)
         etmek istersek once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele'ye tiklariz
         Karsimiza cikan HTML kodlarindan locater'lardan(konum belirleyiciler) essiz olani seceriz.
         Genellikle id Attibute'u kullanilir.Sectigimiz attribute degerini findElement()methodu icine
         findElement(By.id("atribute")seklinde yazariz.
         */

        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdiriniz.

        List <WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi : " +inputTags.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("A Tag Sayisi : " +linklerList.size());




    }
}
